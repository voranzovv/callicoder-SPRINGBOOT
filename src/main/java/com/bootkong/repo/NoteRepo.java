package com.bootkong.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootkong.model.Note;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

}
