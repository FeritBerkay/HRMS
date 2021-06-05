package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.Dto.AdvertisementDto;
import kodlama.HRMS.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<AdvertisementDto>> getAllDetail();
	DataResult<List<AdvertisementDto>> getAllByActive();
	DataResult<List<JobAdvertisement>> getAllSortedByDate();
	Result add(JobAdvertisement advertisement);
	Result update(JobAdvertisement advertisement);
}
