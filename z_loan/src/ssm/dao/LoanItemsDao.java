package ssm.dao;

import java.util.List;

import ssm.model.LoanItems;
import ssm.model.LoanModel;
import ssm.model.LoanQueryItems;
import ssm.model.LoanQueryModel;

public interface LoanItemsDao {
	int add(LoanItems lm);

	List<LoanItems> findAll(int lqm);
}
