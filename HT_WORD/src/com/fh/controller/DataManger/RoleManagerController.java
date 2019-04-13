package com.fh.controller.DataManger;

import java.io.PrintWriter;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Resource;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONArray;
import com.fh.controller.base.BaseController;
import com.fh.entity.app.Menu;
import com.fh.entity.app.Role;
import com.fh.entity.app.RoleMenu;
import com.fh.entity.app.Users;
import com.fh.service.app.MenuService;
import com.fh.service.app.RoleService;
import com.fh.service.app.RoleMenuService;
import com.fh.util.Const;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/role")
public class RoleManagerController  extends BaseController {

	@Resource(name="RoleServiceImpl")
	private RoleService RoleService;
	
	@Resource(name="RoleMenuServiceImpl")
	private  RoleMenuService  RoleMenuService;
	@Resource(name="MenuServiceImpl")
	private  MenuService menuService;
	
	@RequestMapping(value="/rolelist")
	public ModelAndView rolelist()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		Session session = Jurisdiction.getSession();
		Users users = (Users)session.getAttribute(Const.SESSION_USER);
		pd = this.getPageData();
		List<Role> roleList =RoleService.SelectRoles(pd); 
		mv.setViewName("role/role_list");
		mv.addObject("roleList", roleList);
		mv.addObject("users", users);
		return mv;
	}
	
	@RequestMapping(value="/toAdd")
	public ModelAndView toAdd(int pid)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("creator", pid);
		mv.addObject("msg", "add");
		mv.addObject("pd", pd);
		mv.setViewName("role/role_edit"); 
		return mv;
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView add()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData(); 
			 
			RoleService.saveRole(pd);
			mv.addObject("msg","success");
		} catch(Exception e){
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	@RequestMapping(value="/toEdit")
	public ModelAndView toEdit( int id )throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			pd.put("id", id);
			pd = RoleService.findByUiId(pd);
			mv.addObject("msg", "edit");
			mv.addObject("pd", pd);
			mv.setViewName("role/role_edit");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	@RequestMapping(value="/toAuthorize")
	public ModelAndView toAuthorize( int id )throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			pd.put("id", id);
			PageData spd = new PageData();
			spd.put("rid", id);
		    List<RoleMenu>	RoleMenus = RoleMenuService.SelectRoleMenus(spd);
		    
		    List<Menu> menuList = menuService.listAllMenuQx(0);	//获取所有菜单
			menuList = this.readMenu(menuList, RoleMenus);			//根据角色权限处理菜单权限状态(递归处理)
			JSONArray arr = JSONArray.fromObject(menuList);
			String json = arr.toString();
			json = json.replaceAll("pid", "pId").replaceAll("subMenu", "nodes").replaceAll("hasMenu", "checked");
			mv.addObject("zTreeNodes", json);
			mv.addObject("msg", "edit");
			mv.addObject("id", id);
			mv.addObject("pd", pd);
			mv.setViewName("role/role_authorize");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		return mv;
	}
	@RequestMapping(value="/saveauth")
	public void saveMenuqx(@RequestParam int id,@RequestParam String menuIds,PrintWriter out)throws Exception{
		 
		 
		 
		
		try{
			PageData spd = new PageData();
			spd.put("rid", id);
			//List<RoleMenu>	RoleMenus = RoleMenuService.SelectRoleMenus(pd);
			 RoleMenuService.deleteRoleMenus(spd);
			if(null != menuIds && !"".equals(menuIds.trim())){
				String ids[]=menuIds.split(",\\s*");
				for(String mid: ids)
				{
					PageData pd = new PageData();
					pd.put("pid", mid);
					pd.put("rid", id); 
					RoleMenuService.saveRoleMenu(pd);
				}
			}else{
				 
			}
				 
			out.write("success");
			out.close();
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
	}
	public List<Menu> readMenu(List<Menu> menuList,List<RoleMenu> roleRights){
		for(Menu menu :menuList){
			
			 boolean has=false;
			 for(RoleMenu m:roleRights){has=has||m.getPid().equals(menu.getId());}
			//roleRights.forEach((a)->{ has=has||a.getPid().equals(menu.getId());});
			menu.setHasMenu( has);
			this.readMenu(menu.getSubMenu(), roleRights);					//是：继续排查其子菜单
		}
		return menuList;
	}
	@RequestMapping(value="/edit")
	public ModelAndView edit()throws Exception{
		 
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			
			PageData oldpd = RoleService.findByUiId(pd);
			oldpd.put("name", pd.get("name"));
			oldpd.put("desc", pd.get("desc")); 
			RoleService.editRole(oldpd); 
			mv.addObject("msg","success");
		} catch(Exception e){
			logger.error(e.toString(), e);
			mv.addObject("msg","failed");
		}
		mv.setViewName("save_result");
		return mv;
	}
	
	@RequestMapping(value="/delete")
	public void deleteU(PrintWriter out) throws Exception{
		 
		PageData pd = new PageData();
		pd = this.getPageData();
		RoleService.deleteRole(pd); 
		out.write("success");
		out.close();
	}
}
