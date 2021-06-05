package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Experience;


public interface ExperienceDao extends JpaRepository<Experience,Integer> {

   //Experience getById(int id);
  //  List<Experience>getByJobhunter_userId(int jobHunterId);
    List<Experience>getByJobhunter_userIdOrderByLeaveDateDesc(int jobHunterId);
}