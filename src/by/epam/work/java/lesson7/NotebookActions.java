package by.epam.work.java.lesson7;

import java.util.List;

public class NotebookActions {

    public void addNote(Note note, Notebook notebook){
        List<Note> listNote = notebook.getNoteBook();
        listNote.add(note);
        notebook.setNoteBook(listNote);
    }
    public void removeNote(Note note, Notebook notebook){
        List<Note> listNote = notebook.getNoteBook();
        listNote.remove(note);
        notebook.setNoteBook(listNote);
    }

}
