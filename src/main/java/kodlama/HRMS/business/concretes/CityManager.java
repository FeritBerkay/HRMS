package kodlama.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.HRMS.business.abstracts.CityService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.core.Utilities.SuccessDataResult;
import kodlama.HRMS.dataAccess.abstracts.CityDao;
import kodlama.HRMS.entities.concretes.City;
@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
   @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"All City Listed!");
	}
}