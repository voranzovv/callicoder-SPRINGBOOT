package com.bootkong.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootkong.model.Note;
import com.bootkong.repo.NoteRepo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class NoteController {
	
	@Autowired
	NoteRepo noteRepo;
	
	@GetMapping("/notes")
	public List<Note> getAllNotes(){
//		List<Note> n = new ArrayList<Note>();
//		for(Note ne : n) {
//			System.out.println(ne);
//		}
		//System.out.println("hellllllllllllllllllllooooooooooooooo");
		return noteRepo.findAll();
		
	}
	
	
	// Create a new Note
	@PostMapping("/notes")
	public Note createNote(@Valid @RequestBody Note note) {
	    return noteRepo.save(note);
	}

}
