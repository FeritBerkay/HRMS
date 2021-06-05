package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Education;

public interface EducationService {

	Result add(Education education);
	
	DataResult<List<Education>> getAll();
	DataResult<List<Education>>getByJobhunterOrderByGraduationDateDesc(int jobHunterId);
	
}
