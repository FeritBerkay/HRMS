package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.dataAccess.abstracts.EmployerDao;
import kodlama.HRMS.entities.concretes.Employer;
import kodlama.HRMS.business.abstracts.UserService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.SuccessDataResult;



@Service
public class EmployerManager {
	
	private EmployerDao employerDao;
	private UserService userService;
	
    @Autowired
	public EmployerManager(EmployerDao employerDao,UserService userService) {
		super();
		this.employerDao = employerDao;
		this.userService=userService;
	}
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Employer Listed");
	}

}
