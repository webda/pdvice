package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.Menu;

import org.apache.ibatis.annotations.Param;
/**
 * Menu的Dao接口
 * 
 * @author 
 *
 */
public interface MenuDao {

	/**
	 * 获得Menu数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getMenuRowCount(Assist assist);
	
	/**
	 * 获得Menu数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<Menu> selectMenu(Assist assist);
	/**
	 * 通过Menu的id获得Menu对象
	 * 
	 * @param id
	 * @return
	 */
	Menu selectMenuById(Integer id);
	
	/**
	 * 获得一个Menu对象,以参数Menu对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	Menu selectMenuObjSingle(Menu obj);
	
	/**
	 * 获得一个Menu对象,以参数Menu对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<Menu> selectMenuByObj(Menu obj);

	/**
	 * 插入Menu到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertMenu(Menu value);
	
	/**
	 * 插入Menu中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullMenu(Menu value);
	
	/**
	 * 批量插入Menu到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertMenuByBatch(List<Menu> value);
	/**
	 * 通过Menu的id删除Menu
	 * 
	 * @param id
	 * @return
	 */
	int deleteMenuById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除Menu
	 * 
	 * @param assist
	 * @return
	 */
	int deleteMenuByAssist(Assist assist);
	
	/**
	 * 通过Menu的id更新Menu中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateMenuById(Menu enti);
	
	/**
	 * 通过Menu的id更新Menu中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullMenuById(Menu enti);
	
	/**
	 * 通过辅助工具Assist的条件更新Menu中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateMenu(@Param("enti") Menu value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新Menu中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullMenu(@Param("enti") Menu value, @Param("assist") Assist assist);
}