package kodlama.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.HRMS.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer>  {

}
