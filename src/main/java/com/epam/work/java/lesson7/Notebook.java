package main.java.com.epam.work.java.lesson7;

import java.util.List;
import java.util.Objects;

public class Notebook {
    private String name;
    private int cost;
    private List<Note> listNote;

    public Notebook() {
    }

    public Notebook(String name) {
        this.name = name;
    }

    public Notebook(int cost) {
        this.cost = cost;
    }

    public Notebook(List<Note> noteBook) {
        this.listNote = noteBook;
    }

    public Notebook(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Notebook(String name, List<Note> noteBook) {
        this.name = name;
        this.listNote = noteBook;
    }

    public Notebook(int cost, List<Note> noteBook) {
        this.cost = cost;
        this.listNote = noteBook;
    }

    public Notebook(String name, int cost, List<Note> noteBook) {
        this.name = name;
        this.cost = cost;
        this.listNote = noteBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Note> getNoteBook() {
        return listNote;
    }

    public void setNoteBook(List<Note> noteBook) {
        this.listNote = noteBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return cost == notebook.cost && Objects.equals(name, notebook.name) && Objects.equals(listNote, notebook.listNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, listNote);
    }

    @Override
    public String toString() {
        return "Notebook name is '" + name + "' and its costs = " + cost + ". Notes in this notebook: " + listNote ;
    }

}