package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.CoverLetter;

public interface CoverLetterService {

     Result add(CoverLetter letter);
    DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId);
	DataResult<List<CoverLetter>> getAll();
}
