package kodlama.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CandidateService;
import kodlama.HRMS.business.abstracts.EmployerService;
import kodlama.HRMS.business.abstracts.VerifyCodeService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.ErrorDataResult;
import kodlama.HRMS.core.Utilities.ErrorResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.entities.concretes.Candidate;
import kodlama.HRMS.entities.concretes.Employer;


@Service
public class AuthManager {
	
	private CandidateService candidateService;
	private EmployerService employerService;
	private VerifyCodeService veriCode;
	
	
    @Autowired
	public AuthManager(CandidateService candidateService,EmployerService employerService) {
		super();
		this.candidateService = candidateService;
		this.employerService=employerService;
	}

	//@Override
	//public DataResult<Candidate> registerJobHunter(Candidate candidate, String confirmPassword) {
    //if(this.confirmPass(candidate.getPassword(), confirmPassword).isSuccess() )
    //{
			
			
    //	var register=this.jobHunterService.add(jobHunter);
    //	this.veriCode.add(jobHunter.getUserId());
    //	this.veri.verifyByCode(this.veriCode.generateCode(),jobHunter.getEmail());
    //	return new SuccessDataResult<JobHunter>(register.getMessage());
    //}
    //return new ErrorDataResult<JobHunter>("register failed");
		
		
    //	}

	//@Override
	//public DataResult<Employer> registerEmployer(Employer employer, String confirmPassword) {
		
		//if(this.confirmPass(employer.getPassword(), confirmPassword).isSuccess()) {
			//if(this.checkEmailDomain(employer.getEmail(), employer.getWebsite()).isSuccess()) {
				
			 //  this.employerService.add(employer);
			   //return new SuccessDataResult<Employer>(employer,"Register Success");
			//}
			//return new ErrorDataResult<Employer>(employer,"Domain not match");
			
	//	}
		//return new ErrorDataResult<Employer>("register failed");
//}
	
	
	private Result confirmPass(String password,String confirmPassword) 
	{	
		
		if (password.equals(confirmPassword)) {
			
			return new SuccessResult("Password Match!");
		}
		return new ErrorResult("Password not match!");
	
	}
	
	private Result checkEmailDomain(String email,String website) {
		
		String[] mail=email.split("@",2);
		String web=website.substring(4);
		if(mail[1].equals(web)) {
			return new SuccessResult("Domain Match");
		}
		return new ErrorResult("Domain not match");
	}
}
