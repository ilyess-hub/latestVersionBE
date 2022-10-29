package com.example.demoelarning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoelarning.models.Reclamation;
import com.example.demoelarning.repository.ReclamationRepo;
import com.example.demoelarning.repository.UserRepo;
import com.example.demoelarning.service.ReclamationService;
@Service
public class ReclamationServiceImpl implements ReclamationService {
	@Autowired
	ReclamationRepo reclamationRepo;
	@Autowired
	UserRepo userRepo;

	@Override
	public Reclamation addReclamation(Reclamation a) {
		// TODO Auto-generated method stub
		return this.reclamationRepo.save(a);
	}

	@Override
	public List<Reclamation> getAllReclamations() {
		// TODO Auto-generated method stub
		return this.reclamationRepo.findAll();
	}

	@Override
	public Reclamation getById(Long id) {
		// TODO Auto-generated method stub
		Optional<Reclamation>r=this.reclamationRepo.findById(id);
		return r.isPresent()?r.get():null;
	}

	@Override
	public Reclamation updateReclamation(Reclamation a) {
		// TODO Auto-generated method stub
		return this.reclamationRepo.save(a);
	}

	@Override
	public void deleteReclamation(long id) {
		// TODO Auto-generated method stub
		this.reclamationRepo.deleteById(id);
		
	}


}
