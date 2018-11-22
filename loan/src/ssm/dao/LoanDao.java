package ssm.dao;

import java.util.List;

import ssm.model.LoanModel;
import ssm.model.LoanQueryModel;

public interface LoanDao {
	List<LoanModel> find(LoanQueryModel lqm);

	
}
