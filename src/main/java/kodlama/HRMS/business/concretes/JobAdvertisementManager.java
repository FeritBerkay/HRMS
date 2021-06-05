package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.JobAdvertisementService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.HRMS.entities.Dto.AdvertisementDto;
import kodlama.HRMS.entities.concretes.JobAdvertisement;



@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao advertisement;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisement) {
		super();
		this.advertisement = advertisement;
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<AdvertisementDto>> getAllDetail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<AdvertisementDto>> getAllByActive() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByDate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result add(JobAdvertisement advertisement) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result update(JobAdvertisement advertisement) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
