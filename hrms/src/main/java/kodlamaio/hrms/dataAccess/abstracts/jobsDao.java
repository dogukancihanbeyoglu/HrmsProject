package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.jobTitles;

public interface jobsDao extends JpaRepository<jobTitles, Integer> {

}
