package ssm.service;

import java.util.List;

import ssm.model.LoanItems;
import ssm.model.LoanModel;
import ssm.model.LoanQueryItems;
import ssm.model.LoanQueryModel;

public interface LoanItemsService {
	int add(LoanItems lm);

	List<LoanItems> findAll(int lqi);
	
	
}
