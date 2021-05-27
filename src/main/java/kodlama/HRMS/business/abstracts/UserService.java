package kodlama.HRMS.business.abstracts;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.entities.concretes.User;

public interface UserService {

	DataResult<User> checkEmail(String email);
}
