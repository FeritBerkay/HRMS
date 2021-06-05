package kodlama.HRMS.entities.Dto;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertisementDto {

	private int id;
	private String companyName;
	private String name;
	private int openPositions;
	private LocalDate appDate;
	private LocalDate appDeadline;
	private boolean isActive;
}