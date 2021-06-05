package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education,Integer> {

	
	List<Education>getByJobhunter_userIdOrderByGraduationDateDesc(int jobHunterId);
}
