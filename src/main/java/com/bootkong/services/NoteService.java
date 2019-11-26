package com.bootkong.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootkong.model.Note;
@Service
public interface NoteService {
	List<Note> getAllNotes();
	Note createNote( Note note);
	Optional <Note> getNoteById(Long id);
	

}
