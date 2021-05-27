package kodlama.HRMS.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public  class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    @Email(message = "Enter a valid email!")
    @NotEmpty
    @NotBlank(message = "Email can not be empty!")
    private String email;

    @Column(name = "password")	
    @NotEmpty
    @NotBlank(message = "Password can not be empty!")
    private String password;
}