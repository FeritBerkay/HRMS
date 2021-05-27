package kodlama.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor @Getter @Setter
@EqualsAndHashCode(callSuper = true)
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    @NotEmpty
    @NotBlank(message = "Company name can not be empty!")
    private String companyName;

    @Column(name = "web_address")
    @NotEmpty
    @NotBlank(message = "Web address can not be empty!")
    private String webAddress;

    @Column(name = "phone_number")
    @NotEmpty
    @NotBlank(message = "Phone number can not be empty!")
    private String phoneNumber;
}