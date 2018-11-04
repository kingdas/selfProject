package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.LoanItemsDao;
import ssm.model.LoanItems;
import ssm.model.LoanModel;
import ssm.model.LoanQueryItems;
import ssm.model.LoanQueryModel;

@Service
public class LoanItemsServiceImpl implements LoanItemsService {

	@Autowired
	LoanItemsDao loanItemsDao;

	@Override
	public int add(LoanItems lm) {
		return loanItemsDao.add(lm);
	}

	@Override
	public List<LoanItems> findAll(int lqi) {
		return loanItemsDao.findAll(lqi);
	}

}
