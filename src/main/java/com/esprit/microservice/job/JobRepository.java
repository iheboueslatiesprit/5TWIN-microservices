package com.esprit.microservice.job;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JobRepository extends JpaRepository<Job,Integer> {

    @Query("UPDATE Job j SET j.etat = ?1 WHERE j.id = ?2")
    public void updateEtat(Boolean etat, int id);
}
