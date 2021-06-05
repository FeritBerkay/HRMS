package kodlama.HRMS.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Image;

public interface ImageService {

	Result upload (int id,MultipartFile file);
	DataResult<Image>getByJobhunter(int jobHunterId);
	DataResult<List<Image>> getAll();
	
}
