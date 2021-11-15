package by.epam.work.java.lesson7;

import java.util.Date;
import java.util.Objects;

public class Note {
    private int number;
    private String note;

    public Note() {
    }

    public Note(int number) {
        this.number = number;
        this.note = null;
    }

    public Note(int number, String note) {
        this.number = number;
        this.note = note;
    }

    public Note(String note) {
        this.note = note;
        this.number=42;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return number +  " - " + note ;
    }
}