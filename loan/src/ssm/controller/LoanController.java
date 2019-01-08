package ssm.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.model.LoanItems;
import ssm.model.LoanModel;
import ssm.model.LoanQueryModel;
import ssm.service.LoanItemsService;
import ssm.service.LoanService;

@Controller
@RequestMapping("loan")
public class LoanController {

	@Autowired
	LoanService loanService;
	@Autowired
	LoanItemsService loanItemsService;

	@RequestMapping(value = "loginAction", method = RequestMethod.POST)
	public String longin(LoanQueryModel lqm, HttpSession hs, HttpServletResponse resp) {
		LoanModel lm = loanService.find(lqm);
		String t = "";
		if (lm != null) {
			t = "1";
			hs.setAttribute("lm", lm);
			try {
				resp.getWriter().print(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "frame";
		} else {
			t = "           用户名或密码错误！                         ";
			try {
				resp.getWriter().print(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

	@RequestMapping(value = "applyAction", method = RequestMethod.POST)
	public String apply(Model m, LoanItems lit, HttpServletRequest req) {
		LoanModel lm = (LoanModel) req.getSession().getAttribute("lm");
		lit.setEmployeeId(lm.getId());
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String da = sdf.format(date);
		lit.setApplyDate(da);
		lit.setStatus(0);
		loanItemsService.add(lit);
		return "redirect:/loan/loadAction";
	}

	@RequestMapping("loadAction")
	public String load(Model m, HttpServletRequest req) {
		LoanModel emp = (LoanModel) req.getSession().getAttribute("lm");
		List<LoanItems> li = loanItemsService.findAll(emp.getId());
		m.addAttribute("li", li);
		return "showResult";
	}

	@RequestMapping("menuAction")
	public String Menu(HttpServletRequest req) {
		LoanModel emp = (LoanModel) req.getSession().getAttribute("lm");
		if (emp.getGroupId() == 1) {
			return "menuManager";
		}
		return "menuStaff";
	}

	@RequestMapping("applyRelay")
	public String applyRe(Model m, HttpServletRequest rsq) {
		return "apply";
	}
}
