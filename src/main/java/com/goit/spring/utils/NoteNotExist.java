package com.goit.spring.utils;

public class NoteNotExist extends  RuntimeException{
    public NoteNotExist(long id){
        super("Note with ID = " + id + " not exist");
    }
}
