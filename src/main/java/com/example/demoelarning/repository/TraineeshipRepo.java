package com.example.demoelarning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoelarning.models.Traineeship;
@Repository
public interface TraineeshipRepo extends JpaRepository<Traineeship, Long> {

}
