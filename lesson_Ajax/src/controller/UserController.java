package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImplement;
import user.User;
import user.UserQuery;

public class UserController extends HttpServlet {
	private UserService userService = new UserServiceImplement();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String m = req.getParameter("m");
//		System.out.print(m);
		if ("add".equals(m)) {
			add(req, resp);
		} else if ("update".equals(m)) {
			update(req, resp);
		} else if ("doUpdate".equals(m)) {
			doUpdate(req, resp);
		} else if ("delete".equals(m)) {
			delete(req, resp);
		} else if ("findName".equals(m)) {
			findName(req, resp);
		} else if ("statusName".equals(m)) {
			statusName(req, resp);
		} else {
			list(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	private void statusName(HttpServletRequest req, HttpServletResponse resp) {
		UserQuery uq = new UserQuery();
		uq.setName(req.getParameter("name"));
		uq.setStatus(Integer.parseInt(req.getParameter("status")));
		List<User> us = userService.findStatusName(uq);
		req.setAttribute("us", us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void findName(HttpServletRequest req, HttpServletResponse resp) {
		String t = "";
		if (userService.findName(req.getParameter("name"))) {
			t = "1";
		} else {
			t = "0";
		}
		try {
			resp.getWriter().print(t);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void delete(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("operator_id");
		int id = Integer.parseInt(ids);
		userService.delete(id);
		list(req, repn);
	}

	void add(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("operator_id");
		int Operator_id = Integer.parseInt(ids);
		String Name = req.getParameter("name");
		String Password = req.getParameter("password");
		String ss = req.getParameter("status");
		int Status = Integer.parseInt(ss);
		User user = new User(Operator_id, Name, Password, Status);
		userService.add(user);
		try {
			repn.getWriter().print("<script>alert('恭喜你，添加用户成功');close();opener.location.href='rely';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void update(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("operator_id");
		int id = Integer.parseInt(ids);
		User u = userService.findById(id);
		req.setAttribute("u", u);
		try {
			req.getRequestDispatcher("userUpdate.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doUpdate(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("operator_id");
		int Operator_id = Integer.parseInt(ids);
		String Name = req.getParameter("name");
		String Password = req.getParameter("password");
		String ss = req.getParameter("status");
		int Status = Integer.parseInt(ss);
		User u = new User(Operator_id, Name, Password, Status);
		userService.update(u);
		try {
			repn.getWriter().print("<script>alert('恭喜你，用户更新成功');close();opener.location.href='rely';</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		list(req, repn);
	}

	void list(HttpServletRequest req, HttpServletResponse repn) {
		List<User> us = userService.findAll();
		req.setAttribute("us", us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}