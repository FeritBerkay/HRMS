package kodlama.HRMS.business.abstracts;

import java.util.List;

import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
