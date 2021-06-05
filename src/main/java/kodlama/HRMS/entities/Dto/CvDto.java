package kodlama.HRMS.entities.Dto;

import java.util.List;

import kodlama.HRMS.entities.concretes.Education;
import kodlama.HRMS.entities.concretes.CoverLetter;
import kodlama.HRMS.entities.concretes.Experience;
import kodlama.HRMS.entities.concretes.Image;
import kodlama.HRMS.entities.concretes.Ability;
import kodlama.HRMS.entities.concretes.Candidate;
import kodlama.HRMS.entities.concretes.Language;
import kodlama.HRMS.entities.concretes.Link;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {

	private Candidate candidate;
	private Image image;
	private List<CoverLetter> coverletters;
	private List<Education> educations;
	private List<Experience> experiences;
	private List<Ability>	abilities;
	private List<Language> languages;
	private List<Link> links;
	
	
	
}