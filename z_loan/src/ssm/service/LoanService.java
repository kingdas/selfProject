 package ssm.service;

import java.util.List;

import ssm.model.LoanModel;
import ssm.model.LoanQueryModel;

public interface LoanService {
	LoanModel find(LoanQueryModel lqm);
	
	
}
