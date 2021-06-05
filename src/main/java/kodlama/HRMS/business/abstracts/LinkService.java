package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Link;

public interface LinkService {

	Result add(Link link);
	DataResult<List<Link>> getAll();
	DataResult<List<Link>>getByJobhunter(int jobHunterId);
}
