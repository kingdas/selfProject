package com.yc.oa.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.oa.model.Employee;
import com.yc.oa.model.Loan;
import com.yc.oa.service.LoanService;

@Controller
@RequestMapping("loan")
public class LoanController {

	@Autowired
	private LoanService loanService;

	@RequestMapping("content")
	public String content(HttpSession sess, Model m) {
		Employee emp = (Employee) sess.getAttribute("emp");
		m.addAttribute("ls", loanService.findByEmployeeId(emp.getId()));
		return "content";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Loan l,HttpSession sess)
	{
		Employee emp = (Employee) sess.getAttribute("emp");
		l.setApplyDate(new Date());
		l.setEmployeeId(emp.getId());
		l.setStatus(0);
		loanService.add(l);
		return "redirect:/loan/content";
	}
	

}
