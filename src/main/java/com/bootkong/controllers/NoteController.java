package com.bootkong.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootkong.model.Note;
import com.bootkong.repo.NoteRepo;
import com.bootkong.services.NoteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class NoteController {




	@Autowired
//	NoteRepo noteRepo;
	NoteService noteService;

	@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteService.getAllNotes();

	}

	// Create a new Note
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note note) {
		return noteService.createNote(note);
	}

	// Get a Single Note
	@GetMapping("/notes/{id}")
	public Optional <Note> getNoteById(@PathVariable(value = "id") Long id) {
		return noteService.getNoteById(id);
	}

}
