package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.HRMS.business.abstracts.UserService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.dataAccess.abstracts.CandidateDao;
import kodlama.HRMS.entities.concretes.Candidate;

public class CandidateManager {
	private CandidateDao candidateDao;
	private UserService userService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao,UserService userService) {
		super();
		this.candidateDao = candidateDao;
		this.userService=userService;
	}
	
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>( this.candidateDao.findAll(),"Condidates Listed");
	}

}
