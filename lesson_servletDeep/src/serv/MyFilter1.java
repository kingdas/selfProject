package serv;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/*")//这种情况表示过滤所有的servlet
@WebFilter("/ms1") // 表示只过滤servletMyServlet1
public class MyFilter1 implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("MyFilter1");// 伴随着服务器启动而调用
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		System.out.println("...");
		chain.doFilter(request, response);
		System.out.println("!!!");
	}

	public void destroy() {
		System.out.println("MyFilter2");// 伴随着服务器关闭而调用
	}

}
