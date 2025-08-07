package com.goit.spring.service;

import com.goit.spring.entity.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {
    private final Map<Long, Note> notes = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public Note add(Note note) {
        long id = idGenerator.getAndIncrement();
        note.setId(id);
        notes.put(id, note);
        return note;
    }

    public void deleteById(long id) {
        if (!notes.containsKey(id)) {
            throw new NoSuchElementException("ID = " + id + " not exist");
        }
        notes.remove(id);
    }

    void update(Note note) {
        Long id = note.getId();
        if (!notes.containsKey(id)) {
            throw new NoSuchElementException("ID = " + id + " not exist");
        }
        Note existNote = notes.get(id);
        existNote.setContent(note.getContent());
        existNote.setTitle(note.getTitle());
    }

    public Note getById(long id) {
        Note note = notes.get(id);
        if (note == null) {
            throw new NoSuchElementException("ID = " + id + " not exist");
        }
        return note;

    }

    public List<Note> listAll() {
        return new ArrayList<>(notes.values());
    }
}
