package com.bootkong.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootkong.services.NoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootkong.model.Note;
import com.bootkong.repo.NoteRepo;
@Service
public class NoteSerrviceImpl implements NoteService {
	@Autowired
	NoteRepo noteRepo;

	public List<Note> getAllNotes() {
		return noteRepo.findAll();

	}

	// Create a new Note
	public Note createNote(@Valid @RequestBody Note note) {
		return noteRepo.save(note);
	}

	// Get a Single Note
	public Optional <Note> getNoteById(@PathVariable(value = "id") Long id) {
		return noteRepo.findById(id);
	}

}
