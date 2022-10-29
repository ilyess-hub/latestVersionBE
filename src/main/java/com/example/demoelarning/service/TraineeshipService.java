package com.example.demoelarning.service;

import java.util.List;

import com.example.demoelarning.models.Traineeship;

public interface TraineeshipService {
	public Traineeship addTraineeship(Traineeship a);
	public List<Traineeship> getAllTraineeships();
	public Traineeship getById(Long id);
	public Traineeship updateTraineeship(Traineeship a);
	public void deleteTraineeship(Long id);
	public Traineeship abonner(Traineeship a,Long id);

}
