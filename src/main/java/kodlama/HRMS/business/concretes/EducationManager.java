package kodlama.HRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.EducationService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.EducationDao;
import kodlama.HRMS.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationdao;
	
	@Autowired
	public EducationManager(EducationDao educationdao) {
		super();
		this.educationdao = educationdao;
	}

	@Override
	public Result add(Education education) {
		this.educationdao.save(education);
		return new SuccessResult("education added");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationdao.findAll(),"educations listed");
	}

	@Override
	public DataResult<List<Education>> getByJobhunterOrderByGraduationDateDesc(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Education>>(this.educationdao.getByJobhunter_userIdOrderByGraduationDateDesc(jobHunterId));
	}

}
