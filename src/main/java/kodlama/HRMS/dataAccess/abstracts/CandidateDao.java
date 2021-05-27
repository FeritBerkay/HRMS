package kodlama.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer> {

	
	Candidate findBynationalIdentity(String nationalIdentity);
	
}
