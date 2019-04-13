package com.fh.controller.app.appuser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fh.controller.base.BaseController;
import com.fh.service.system.fhlog.FHlogManager;
import com.fh.service.system.fhlog.impl.FHlogService;
import com.fh.util.Const;
import com.fh.util.PageData;


@Service
public class MySessionListener extends BaseController implements HttpSessionListener 
{
	//@Resource(name="fhlogService")
	//private FHlogManager fhlogService;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("创建session");
		ServletContext ctx=arg0.getSession().getServletContext();  
	      HttpSession sess = arg0.getSession();
	      
	     
	     /*
	      String CREATETIME="2018-12-17 20:24:57";
	      String CREATETIME1=CREATETIME.substring(0, 10);
	      String EndTime="2018-12-18 00:24:57";
	      String EndTime1=EndTime.substring(0, 10);
	      SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	      PageData pd = new PageData();
	      PageData pd2 = new PageData();
	    ///通过抽象的私有方法得到Spring容器中Bean的实例。
			FHlogService fhlogService=(FHlogService)this.getObjectFromApplication(sess.getServletContext(),"fhlogService");
			if( EndTime1.equals(CREATETIME1) )
			{
				try
			{
				long from = simpleFormat.parse(CREATETIME).getTime();  
				long to = simpleFormat.parse(EndTime).getTime();  
				float minutes = (float) ((to - from)/(1000 * 60));  
				
				pd.put("USERID", "1");
				pd.put("CZTIME", CREATETIME);
				pd.put("TOTALTIME", minutes );
				
			}catch(ParseException px) {
                px.printStackTrace();
                } 
			
				try {
					fhlogService.savelogtime(pd);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
			else
			{  	try
			{
				long from = simpleFormat.parse(CREATETIME).getTime();  
				String a=CREATETIME1+" 23:59:59";
				long to = simpleFormat.parse(a).getTime();  
				float minutes = (float) ((to - from)/(1000 * 60));  
				
				pd.put("USERID", "1");
				pd.put("CZTIME", CREATETIME);
				pd.put("TOTALTIME", minutes );
				
				String a2=EndTime1+" 00:00:00";
				long from2 = simpleFormat.parse(a2).getTime();  
				long to2 = simpleFormat.parse(EndTime).getTime();  
				float minutes2 = (float) ((to2 - from2)/(1000 * 60));  
				pd2.put("USERID", "1");
				pd2.put("CZTIME", a2);
				pd2.put("TOTALTIME", minutes2 );
				
				
				
				try {
					fhlogService.savelogtime(pd);
					fhlogService.savelogtime(pd2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}catch(ParseException px) {
                px.printStackTrace();
                } 
				
				
			
			}*/
	     

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("销毁session");
		  ServletContext ctx=arg0.getSession().getServletContext();  
	      HttpSession sess = arg0.getSession();
		///通过抽象的私有方法得到Spring容器中Bean的实例。
		FHlogService fhlogService=(FHlogService)this.getObjectFromApplication(sess.getServletContext(),"fhlogService");

		if(arg0.getSession().getAttribute(Const.SESSION_APPUSERID)!=null)
		{
			
		PageData pd = new PageData();
		PageData pd2 = new PageData();
		String USERID=arg0.getSession().getAttribute(Const.SESSION_APPUSERID).toString();
		String a=arg0.getSession().getAttribute(Const.SESSION_APPUSERNAME).toString();
		System.out.println("销毁"+a);
		String EndTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		//String EndTime="2018-11-18 00:28:55";
		String CREATETIME=arg0.getSession().getAttribute(Const.SESSION_APPUSERbetime+a).toString(); 
	    String CREATETIME1=CREATETIME.substring(0, 10);
	    String EndTime1=EndTime.substring(0, 10);
	     
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if( EndTime1.equals(CREATETIME1) )
        {
		try {
			long from = simpleFormat.parse(CREATETIME).getTime();  
			long to = simpleFormat.parse(EndTime).getTime();  
			float minutes = (float) ((to - from)/(1000 * 60));  
			if(minutes>30)minutes=minutes-30;
			pd.put("USERID", USERID);
			pd.put("CZTIME", CREATETIME);
			pd.put("TOTALTIME", minutes );
			} catch(ParseException px) { px.printStackTrace();} 
		
		try {
			fhlogService.savelogtime(pd);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
        }else
		{ 
        	try
		{
			long from = simpleFormat.parse(CREATETIME).getTime();  
			String time=CREATETIME1+" 23:59:59";
			long to = simpleFormat.parse(time).getTime();  
			float minutes = (float) ((to - from)/(1000 * 60));  
			
			
			pd.put("USERID", USERID);
			pd.put("CZTIME", CREATETIME);
			//pd.put("TOTALTIME", minutes );
			
			String time2=EndTime1+" 00:00:00";
			long from2 = simpleFormat.parse(time2).getTime();  
			long to2 = simpleFormat.parse(EndTime).getTime();  
			float minutes2 = (float) ((to2 - from2)/(1000 * 60));  
			if(minutes2>=30)
				minutes2=minutes2-30;
			else
			{
				minutes=minutes-(30-minutes2);
				minutes2=0;
			}
			pd.put("TOTALTIME", minutes );
			pd2.put("USERID", USERID);
			pd2.put("CZTIME", time2);
			pd2.put("TOTALTIME", minutes2 );
			
			
			
			try {
				fhlogService.savelogtime(pd);
				fhlogService.savelogtime(pd2);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}catch(ParseException px) {
            px.printStackTrace();
            } 
		
		}
		}

	}
	
	/** 
     * 通过WebApplicationContextUtils 得到Spring容器的实例。根据bean的名称返回bean的实例。 
     * @param servletContext  ：ServletContext上下文。 
     * @param beanName  :要取得的Spring容器中Bean的名称。 
     * @return 返回Bean的实例。 
     */  
    private Object getObjectFromApplication(ServletContext servletContext,String beanName){  
        //通过WebApplicationContextUtils 得到Spring容器的实例。  
        ApplicationContext application=WebApplicationContextUtils.getWebApplicationContext(servletContext);  
        //返回Bean的实例。  
        return application.getBean(beanName);  
    }    


	

}
