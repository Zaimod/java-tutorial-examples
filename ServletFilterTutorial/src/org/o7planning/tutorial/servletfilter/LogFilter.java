package org.o7planning.tutorial.servletfilter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

	public LogFilter() {
	}

	@Override
	public void destroy() {
		System.out.println("LogFilter destroy!");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		String servletPath = req.getServletPath();

		System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath + ", URL =" + req.getRequestURL());

		// Go to the next element (filter or target) in chain.
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("LogFilter init!");

	}

}
