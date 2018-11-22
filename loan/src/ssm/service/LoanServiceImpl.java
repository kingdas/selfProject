package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.LoanDao;
import ssm.model.LoanModel;
import ssm.model.LoanQueryModel;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;

	@Override
	public LoanModel find(LoanQueryModel lqm) {
		if (loanDao.find(lqm) != null && loanDao.find(lqm).size() > 0) {
			return loanDao.find(lqm).get(0);
		}
		return null;
	}

}
