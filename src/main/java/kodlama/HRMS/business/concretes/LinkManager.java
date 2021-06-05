package kodlama.HRMS.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.LinkService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.LinkDao;
import kodlama.HRMS.entities.concretes.Link;

@Service
public class LinkManager implements LinkService {

	private LinkDao linkdao;
	
	@Autowired
	public LinkManager(LinkDao linkdao) {
		super();
		this.linkdao = linkdao;
	}

	@Override
	public Result add(Link link) {
		this.linkdao.save(link);
		return new SuccessResult("link added!");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Link>>(this.linkdao.findAll(),"Links listed");
	}

	@Override
	public DataResult<List<Link>> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Link>>(this.linkdao.getByJobhunter_userId(jobHunterId));
	}

}
