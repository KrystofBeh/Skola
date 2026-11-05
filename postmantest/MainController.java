package org.example.postmantest;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class MainController {

    private int id = 0;
    private HashMap<Integer, Zakaznik> zakazniks = new HashMap<>();


    //1
    @PostMapping("/leads")
    public Zakaznik leads(@RequestBody Zakaznik registration) {
        ArrayList<Zakaznik> zakazniksList = new ArrayList<>(zakazniks.values());
        for (Zakaznik zak : zakazniksList) {
            if (zak.getEmail().equals(registration.getEmail())) {
                return zak;
            }
        }
        zakazniks.put(id, registration);
        id++;
        return registration;
    }


    //2
    @PostMapping("/leads/{identification}/note")
    public String notes(@PathVariable int identification, @RequestBody Note note) {
        if (!zakazniks.containsKey(identification)) {
            return "Zakaznik neexistuje!";
        }

        zakazniks.get(identification).addNote(note.getNote());
        return "Poznamka byla pridana!";
    }

    //2
    @GetMapping("/leads/{identification}/getNotes")
    public ArrayList<String> getNotes(@PathVariable int identification) {
        if (!zakazniks.containsKey(identification)) {
            return new ArrayList<>();
        }
        return zakazniks.get(identification).getNotes();
    }

    //3
    @PostMapping("/leads/{identification}/reminders")
    public String reminders(@PathVariable int identification, @RequestBody Reminder reminder) {
        if (!zakazniks.containsKey(identification)) {
            return "Zakaznik neexistuje!";
        }

        zakazniks.get(identification).addReminder(reminder);
        return "Poznamka byla pridana!";
    }

    //3
    @GetMapping("/leads/{identification}/getReminders")
    public ArrayList<Reminder> getReminders(@PathVariable int identification) {
        if (!zakazniks.containsKey(identification)) {
            return new ArrayList<>();
        }
        return zakazniks.get(identification).getReminders();
    }



}
