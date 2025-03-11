package com.example.projetlundidixmars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projetlundidixmars.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer>{

}
