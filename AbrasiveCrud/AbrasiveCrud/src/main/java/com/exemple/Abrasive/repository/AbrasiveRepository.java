package com.exemple.Abrasive.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exemple.Abrasive.domain.Abrasive;

@Repository
public interface AbrasiveRepository extends JpaRepository<Abrasive, Long> {
	
	
	

}
