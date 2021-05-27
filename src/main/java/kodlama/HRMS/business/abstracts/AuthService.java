package kodlama.HRMS.business.abstracts;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.entities.concretes.Candidate;
import kodlama.HRMS.entities.concretes.Employer;

public interface AuthService {

	DataResult<Candidate> registerJobHunter(Candidate jobHunter,String confirmPassword);
	DataResult<Employer> registerEmployer(Employer employer,String confirmPassword);
	
	
}