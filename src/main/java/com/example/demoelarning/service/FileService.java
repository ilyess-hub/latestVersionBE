package com.example.demoelarning.service;

import java.util.List;

import com.example.demoelarning.models.File;

public interface FileService {
public File addFile(File a);
public List<File>  getAllFiles();
public File getById(Long id);
public File updateFile(File a);
public void deleteFile(Long id);
}
