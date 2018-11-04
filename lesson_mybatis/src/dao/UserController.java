package dao;

import group.Group;
import group.GroupDao;
import group.GroupDaoMybatisImplement;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String m = req.getParameter("m");
		// System.out.print(m);
		if ("add".equals(m)) {
			add(req, resp);
		} else if ("doAdd".equals(m)) {
			doAdd(req, resp);
		} else if ("update".equals(m)) {
			update(req, resp);
		} else if ("doUpdate".equals(m)) {
			doUpdate(req, resp);
		} else if ("delete".equals(m)) {
			delete(req, resp);
		} else {
			list(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	// ///////////////////
	Userdao userDao = new DaoMybatisImplement();
	GroupDao groupDao = new GroupDaoMybatisImplement();

	void add(HttpServletRequest req, HttpServletResponse repn) {
		List<Group> li = groupDao.findAll();
		req.setAttribute("li", li);
		try {
			req.getRequestDispatcher("userAdd.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doAdd(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		Integer id = null;

		if (!"".equals(ids)) {
			id = Integer.valueOf(ids);
		}
		String name = req.getParameter("name");
		String groupids = req.getParameter("groupid");
		int groupid = Integer.parseInt(groupids);
		User user = new User(id, name, groupid);
		userDao.add(user);
		list(req, repn);
	}

	void delete(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		int id = Integer.parseInt(ids);
		userDao.delete(id);
		list(req, repn);
	}

	void update(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		int id = Integer.parseInt(ids);
		User u = userDao.findById(id);
		req.setAttribute("u", u);
		List<Group> gs = groupDao.findAll();
		req.setAttribute("gs", gs);
		try {
			req.getRequestDispatcher("userUpdate.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doUpdate(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		Integer id = Integer.valueOf(ids);
		String name = req.getParameter("name");
		String groupids = req.getParameter("groupid");
		int groupid = Integer.parseInt(groupids);
		User u = new User(id, name, groupid);
		userDao.update(u);
		list(req, repn);
	}

	void list(HttpServletRequest req, HttpServletResponse repn) {
		List<User> us = userDao.findAll();
		req.setAttribute("us", us);
		// System.out.print(us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
