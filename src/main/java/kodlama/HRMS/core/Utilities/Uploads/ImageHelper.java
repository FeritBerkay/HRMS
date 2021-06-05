package kodlama.HRMS.core.Utilities.Uploads;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;




import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.ErrorDataResult;
import kodlama.HRMS.core.Utilities.SuccessDataResult;

@Service
public class ImageHelper implements ImageUploadService {

	@Override
	public DataResult<Map> upload(MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	public DataResult<Map> upload(MultipartFile file){
//		
//		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
//				"cloud_name", "elsenpai",
//				"api_key", "139844714596837",
//				"api_secret", "TWapBEwHu5C85I6tr6TdeTXnzBI"));
//		
//		
//		 
//			try {
//			
//			
//			Map uploadResult= cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());
//				
//				return new SuccessDataResult<Map>(uploadResult);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return new ErrorDataResult<Map>();
//					
//	}
	
}
