package serv;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(value = "/ms1", loadOnStartup = 1) // 服务器启动时调用init() 方法
@WebServlet("/ms1")
public class MyServlet1 extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init1");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println(req.getParameter("name"));
		resp.getWriter().print(new Random().nextInt(100));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("1111");
		super.service(req, res);
	}

	@Override
	public void destroy() {
		System.out.println("destroy1");
	}

}
