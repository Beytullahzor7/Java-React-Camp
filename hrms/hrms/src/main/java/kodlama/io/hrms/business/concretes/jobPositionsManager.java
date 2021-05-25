package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.jobPositionsService;
import kodlama.io.hrms.dataAccess.abstracts.jobPositionsDao;
import kodlama.io.hrms.entities.concretes.jobPositions;

@Service
public class jobPositionsManager implements jobPositionsService {

	private jobPositionsDao jobpositionsDao;

	@Autowired
	public jobPositionsManager(jobPositionsDao jobpositionsDao) {
		super();
		this.jobpositionsDao = jobpositionsDao;
	}

	@Override
	public List<jobPositions> getAll() {
		return this.jobpositionsDao.findAll();
	}

}
