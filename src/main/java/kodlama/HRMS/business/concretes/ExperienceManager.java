package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.ExperienceService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.ExperienceDao;
import kodlama.HRMS.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experiencedao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experiencedao) {
		super();
		this.experiencedao = experiencedao;
	}

	@Override
	public Result add(Experience exp) {
		this.experiencedao.save(exp);
		return new SuccessResult("exp added!");
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Experience>>(this.experiencedao.findAll(),"exps listed");
	}

	@Override
	public DataResult<List<Experience>> getByJobhunterOrderByLeaveDateDesc(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Experience>>(this.experiencedao.getByJobhunter_userIdOrderByLeaveDateDesc(jobHunterId));
	}

}
