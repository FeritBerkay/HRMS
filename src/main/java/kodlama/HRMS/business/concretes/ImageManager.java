package kodlama.HRMS.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlama.HRMS.business.abstracts.ImageService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.core.Utilities.SuccessResult;
import kodlama.HRMS.core.Utilities.Uploads.ImageHelper;
import kodlama.HRMS.dataAccess.abstracts.ImageDao;
import kodlama.HRMS.entities.concretes.Candidate;
import kodlama.HRMS.entities.concretes.Image;

@Service
public class ImageManager implements ImageService {

	private ImageDao imagedao;
	private ImageService helper;

	@Autowired
	public ImageManager(ImageDao imagedao,ImageHelper helper) {
		super();
		this.imagedao = imagedao;
		this.helper=(ImageService) helper;
	}

	
//	@Override
//	public Result upload(int id,MultipartFile file) {
//		
//		@SuppressWarnings("unchecked")
//		Map<String,String> hey=(Map<String,String>)this.helper.upload(id, file).getData();
//		
//		Candidate hunter =new Candidate();
//		Image image =new Image();
//		hunter.setId(id);
//		image.setCandidate(hunter);
//		
//		 image.setUrl(hey.get("url"));
//		 image.setUpdateDate(LocalDate.now());
//		
//	
//		this.imagedao.save(image);
//		return new SuccessResult();
//	}

	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Image>>(this.imagedao.findAll());
	}


	@Override
	public DataResult<Image> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Image>(this.imagedao.getByJobhunter_userId(jobHunterId));
	}


	@Override
	public Result upload(int id, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}
}
