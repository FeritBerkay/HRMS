package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.LanguageService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.LanguageDao;
import kodlama.HRMS.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languagedao;
	@Autowired
	public LanguageManager(LanguageDao languagedao) {
		super();
		this.languagedao = languagedao;
	}

	@Override
	public Result add(Language lang) {
		this.languagedao.save(lang);
		return new SuccessResult("Language added");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languagedao.findAll(),"languages listed");
	}

	@Override
	public DataResult<List<Language>> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Language>>(this.languagedao.getByJobhunter_userId(jobHunterId));
	}
}
