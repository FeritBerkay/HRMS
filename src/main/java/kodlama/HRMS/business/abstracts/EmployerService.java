package kodlama.HRMS.business.abstracts;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Employer;
import java.util.List;

public interface EmployerService {

	Result add(Employer employer);
	//Result update(Employer employer);
	//Result delete(Employer employer);
	
	DataResult<List<Employer>> getAll();
	//DataResult<Employer> get(int id);
}
