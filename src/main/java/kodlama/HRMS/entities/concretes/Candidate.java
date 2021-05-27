package kodlama.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.*;

@Data
@Entity
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Candidate extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "national_id")
	private String nationalId;
	
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;


}
