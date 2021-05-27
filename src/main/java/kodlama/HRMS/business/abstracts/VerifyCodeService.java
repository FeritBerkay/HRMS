package kodlama.HRMS.business.abstracts;

import kodlama.HRMS.core.Utilities.Result;

public interface VerifyCodeService {
	Result add (int UserId);
	String generateCode ();
}
