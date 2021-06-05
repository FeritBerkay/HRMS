package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.AbilityService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.AbilityDao;
import kodlama.HRMS.entities.concretes.Ability;

@Service
public class AbilityManager implements AbilityService {

	private AbilityDao abilitydao;

	@Autowired
	public AbilityManager(AbilityDao abilitydao) {
		super();
		this.abilitydao = abilitydao;
	}

	@Override
	public Result add(Ability ability) {
		this.abilitydao.save(ability);
		return new SuccessResult("ability added");
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Ability>>(this.abilitydao.findAll(),"abilities listed");
	}

	

	@Override
	public DataResult<List<Ability>> getByJobhunter(int JobHunterId) {
		
		return new SuccessDataResult<List<Ability>>(this.abilitydao.getByJobhunter_userId(JobHunterId));
	}
}
