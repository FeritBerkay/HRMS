package kodlama.HRMS.core.Utilities;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.VerifyCodeService;
import kodlama.HRMS.dataAccess.abstracts.VerificationCodeDao;
import kodlama.HRMS.entities.concretes.VerificationCode;

@Service
public class VerifyCodeManager implements VerifyCodeService {

	private VerificationCodeDao verification;
   
	@Autowired
	public VerifyCodeManager(VerificationCodeDao verification) {
		super();
		this.verification = verification;
	}

	public Result add(int UserId) {
		VerificationCode verifyCode= new VerificationCode();
		
		//verifyCode.setCode(this.generateCode());
		
		this.verification.save(verifyCode);
		return new SuccessResult();
	}
	
	public String generateCode () {
		
		UUID code= UUID.randomUUID();
		
		return code.toString();
	}
	
	
}
