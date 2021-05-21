package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.JobPositionService;
import kodlama.HRMS.dataAccess.abstracts.JobPositionDao;
import kodlama.HRMS.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}

	
}
