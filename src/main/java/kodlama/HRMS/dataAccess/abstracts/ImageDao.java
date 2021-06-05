package kodlama.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Image;


public interface ImageDao extends JpaRepository<Image,Integer> {

	Image getByJobhunter_userId(int jobHunterId);
}
