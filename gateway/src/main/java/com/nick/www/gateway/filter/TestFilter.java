package com.nick.www.gateway.filter;




import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author "yinzheng"
 * @date 2018-09-02
 */
@WebFilter(filterName = "testFilter", urlPatterns = "/*")
@Order
public class TestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String fileterName =  filterConfig.getFilterName();

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpServletRequestWrapper aa = new HttpServletRequestWrapper(request);

    }

    @Override
    public void destroy() {

    }
}
