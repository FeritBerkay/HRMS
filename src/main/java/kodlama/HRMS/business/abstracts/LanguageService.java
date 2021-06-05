package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Language;

public interface LanguageService {

	Result add(Language lang);
	DataResult<List<Language>> getAll();
	DataResult<List<Language>>getByJobhunter(int jobHunterId);
}
