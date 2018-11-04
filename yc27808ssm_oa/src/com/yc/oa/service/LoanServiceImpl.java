package com.yc.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.framework.BaseDao;
import com.yc.framework.BaseServiceImpl;
import com.yc.oa.dao.LoanDao;
import com.yc.oa.model.Loan;

@Service
public class LoanServiceImpl extends BaseServiceImpl<Loan> implements
		LoanService {

	@Autowired
	private LoanDao loanDao;

	@Override
	public BaseDao<Loan> getDao() {
		return loanDao;
	}

	@Override
	public List<Loan> findByEmployeeId(int empId) {
		Loan lq = new Loan();
		lq.setEmployeeId(empId);
		return loanDao.findByCondition(lq);
	}
}
