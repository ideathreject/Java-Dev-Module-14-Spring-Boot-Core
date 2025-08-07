package com.goit.spring;

import com.goit.spring.entity.Note;
import com.goit.spring.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);

        NoteService noteService = context.getBean(NoteService.class);

        Note note = new Note("homework", "i must finish my homework tomorrow");
        Note note1 = new Note("Groceries", "Milk, Bread, Water");
        Note note2 = new Note("delivery", "send package to family");

        noteService.add(note);
        noteService.add(note1);
        noteService.add(note2);

        System.out.println(noteService.listAll());
        System.out.println("noteService.getById(1l) = " + noteService.getById(1l));
    }
}
