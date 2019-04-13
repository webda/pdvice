package com.fh.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.fh.util.Const;

/**
 * Servlet Filter implementation class UserFilter
 */
@WebFilter("/courselist/getcourse.do")
public class UserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String userStr = (String)((HttpServletRequest)request).getSession().getAttribute(Const.SESSION_APPUSERID);
		if(userStr != null || userStr != "")
			chain.doFilter(request, response);
		else
		{
			String paths = request.getServletContext().getContextPath();
			int endIndex = paths.lastIndexOf("/");
			String path = paths.substring(0, endIndex);
			((HttpServletRequest)request).getRequestDispatcher(path + "/QT_WORD");
		}
			
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
