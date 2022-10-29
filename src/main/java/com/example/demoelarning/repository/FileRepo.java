package com.example.demoelarning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoelarning.models.File;

@Repository
public interface FileRepo extends JpaRepository<File, Long> {

}
