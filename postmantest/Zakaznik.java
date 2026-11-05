package org.example.postmantest;

import java.util.ArrayList;

public class Zakaznik {


    private String name;
    private String email;
    private ArrayList<String> notes = new ArrayList<>();
    private ArrayList<Reminder> reminders = new ArrayList<>();

    public void setReminders(ArrayList<Reminder> reminders) {
        this.reminders = reminders;
    }

    public ArrayList<Reminder> getReminders() {
        return reminders;
    }

    public void setNotes(ArrayList<String> notes) {
        this.notes = notes;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addNote(String  note) {
        notes.add(note);
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }
}
