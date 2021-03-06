package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {

	List<CoverLetter> getByJobhunter_userId(int jobHunterId); 
}
