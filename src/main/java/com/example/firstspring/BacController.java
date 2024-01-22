package com.example.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class BacController {

    @Autowired
    private BacService service;

    @GetMapping
    public List<Bac> getAllBacs() {
        return service.findAll();
    }

    @GetMapping("/{bacNum}")
    public Bac getBacById(@PathVariable Integer bacNum) {
        return service.get(bacNum);
    }

    @PostMapping
    public Bac createBac(@RequestBody Bac bac) {
        service.save(bac);
        return bac; // Assuming you want to return the created Bac object
    }

    @PutMapping("/{bacNum}")
    public Bac updateBac(@PathVariable Integer bacNum, @RequestBody Bac bac) {
        if (!bacNum.equals(bac.getId())) {
            throw new IllegalArgumentException("Path variable ID must match the ID in the request body");
        }
        service.save(bac);
        return bac; // Assuming you want to return the updated Bac object
    }

    @DeleteMapping("/{bacNum}")
    public void deleteBac(@PathVariable Integer bacNum) {
        service.delete(bacNum);
    }
}

