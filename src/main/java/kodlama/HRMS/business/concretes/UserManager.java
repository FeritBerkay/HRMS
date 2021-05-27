package kodlama.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.dataAccess.abstracts.UserDao;
import kodlama.HRMS.entities.concretes.User;

public class UserManager {
	private UserDao userDao;
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	public DataResult<User> checkEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
		}

}
