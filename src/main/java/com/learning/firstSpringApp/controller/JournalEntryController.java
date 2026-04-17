package com.learning.firstSpringApp.controller;

import com.learning.firstSpringApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal") // group internal mappings to this path
public class JournalEntryController {
    // handle http requests

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();


    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){ // its like hey spring, take data from req body and turn it into java object that i can use in my code
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEntryById(@PathVariable Long id){
        journalEntries.remove(id);
        return true;
    }

    @PutMapping("/update/{id}")
    public JournalEntry updateEntry(@PathVariable Long id, @RequestBody JournalEntry myEntry){ // its like hey spring, take data from req body and turn it into java object that i can use in my code
        return journalEntries.put(id, myEntry);
    }
}
