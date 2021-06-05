package kodlama.HRMS.core.Utilities.Uploads;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlama.HRMS.core.Utilities.DataResult;



public interface ImageUploadService {

	
	 DataResult<Map> upload(MultipartFile file);
}
