package main.java.com.epam.work.java.lesson7;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        Note first = new Note(1, "Hello");
        Note second = new Note("Bye");
        List<Note> list = new ArrayList<Note>();
        list.add(first);
        Notebook book = new Notebook();
        book.setNoteBook(list);
        book.setCost(200);
        book.setName("My Notebook");
        NotebookActions addingNote = new NotebookActions();
        NotebookActions removeNote = new NotebookActions();
        System.out.println(book);
        addingNote.addNote(second, book);
        System.out.println(book);
        removeNote.removeNote(first, book);
        System.out.println(book);
    }

}
