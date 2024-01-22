package com.example.firstspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BacService {
    @Autowired
    private BacRepository repository;

    public BacService(BacRepository repository) {
        this.repository = repository;
    }
    public List<Bac> findAll() {
        return repository.findAll();
    }

    public void save(Bac bac) {
        repository.save(bac);
    }

    public Bac get(Integer id) {
        return repository.findById(id).get();
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
