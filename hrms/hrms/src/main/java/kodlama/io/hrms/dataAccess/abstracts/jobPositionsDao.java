package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.jobPositions;

public interface jobPositionsDao extends JpaRepository<jobPositions, Integer> {

}
