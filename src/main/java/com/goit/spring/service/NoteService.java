package com.goit.spring.service;

import com.goit.spring.entity.Note;

import java.util.List;

public interface NoteService {
    Note add(Note note);

    void deleteById(long id);

    void update(Note note);

    Note getById(long id);

    List<Note> listAll();
}
