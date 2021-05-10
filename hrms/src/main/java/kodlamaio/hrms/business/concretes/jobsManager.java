package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.jobsService;
import kodlamaio.hrms.dataAccess.abstracts.jobsDao;
import kodlamaio.hrms.entities.concretes.jobTitles;

@Service
public class jobsManager implements jobsService {
	
	private jobsDao jobsDao;
	
	@Autowired
	public jobsManager(jobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
		
	}

	@Override
	public List<jobTitles> getAll() {
		
		return this.jobsDao.findAll();
	}
	
		
}
