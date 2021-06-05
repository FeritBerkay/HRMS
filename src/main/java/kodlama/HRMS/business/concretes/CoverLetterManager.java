package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CoverLetterService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.CoverLetterDao;
import kodlama.HRMS.entities.concretes.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverLetterdao;
	private CoverLetter letter;

	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterdao) {
		super();
		this.coverLetterdao = coverLetterdao;
	}

	@Override
	public Result add(CoverLetter letter) {
		this.letter = letter;
		this.coverLetterdao.save(letter);
		return new SuccessResult("letter added");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterdao.findAll(),"letters listed");
	}

	@Override
	public DataResult<List<CoverLetter>> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterdao.getByJobhunter_userId(jobHunterId));
	}
	
}
