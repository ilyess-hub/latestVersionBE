package com.example.demoelarning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoelarning.models.File;
import com.example.demoelarning.repository.FileRepo;
import com.example.demoelarning.service.FileService;

@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileRepo fileRepo;

	@Override
	public File addFile(File a) {
		// TODO Auto-generated method stub
		return this.fileRepo.save(a);
	}

	@Override
	public List<File> getAllFiles() {
		// TODO Auto-generated method stub
		return this.fileRepo.findAll();
	}

	@Override
	public File getById(Long id) {
		// TODO Auto-generated method stub
		Optional<File>f=this.fileRepo.findById(id);
		return f.isPresent()?f.get():null;
	}

	@Override
	public File updateFile(File a) {
		// TODO Auto-generated method stub
		return this.fileRepo.save(a);
	}

	@Override
	public void deleteFile(Long id) {
		// TODO Auto-generated method stub
		this.fileRepo.deleteById(id);
		
	}

}
