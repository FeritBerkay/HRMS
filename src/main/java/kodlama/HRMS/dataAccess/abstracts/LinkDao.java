package kodlama.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link,Integer> {

	List<Link>getByJobhunter_userId(int jobHunterId);
}