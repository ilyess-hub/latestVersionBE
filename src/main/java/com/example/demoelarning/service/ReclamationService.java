package com.example.demoelarning.service;



import java.util.List;

import com.example.demoelarning.models.Reclamation;

public interface ReclamationService {
	public Reclamation addReclamation(Reclamation a);
	public List<Reclamation> getAllReclamations();
	public Reclamation getById(Long id);
	public Reclamation updateReclamation(Reclamation a);
	public void deleteReclamation(long id);
	

}
