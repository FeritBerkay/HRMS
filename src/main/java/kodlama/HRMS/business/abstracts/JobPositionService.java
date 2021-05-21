package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
