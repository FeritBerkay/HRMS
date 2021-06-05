package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Language;


public interface LanguageDao  extends JpaRepository<Language,Integer> {

	List<Language> getByJobhunter_userId(int jobHunterId);
}
