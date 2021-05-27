package kodlama.HRMS.business.abstracts;


import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Candidate;



public interface CandidateService {
	Result add(Candidate jobHunt);
	//Result update(JobHunter jobHunt);
	//Result delete(JobHunter jobHunt);
	
	DataResult<List<Candidate>> getAll();
	//DataResult<JobHunter> get(int id);
}
