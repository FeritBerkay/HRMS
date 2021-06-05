package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Experience;

public interface ExperienceService {

	Result add(Experience exp);
	DataResult<List<Experience>>getByJobhunterOrderByLeaveDateDesc(int jobHunterId);
	DataResult<List<Experience>> getAll();
}
