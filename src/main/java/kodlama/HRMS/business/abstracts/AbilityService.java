package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Ability;

public interface AbilityService {

	Result add(Ability ability);
		
	DataResult<List<Ability>> getAll();
	DataResult<List<Ability>> getByJobhunter(int JobHunterId);
}
