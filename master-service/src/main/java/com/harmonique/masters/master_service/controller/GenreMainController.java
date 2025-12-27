package com.harmonique.masters.master_service.controller;

import com.example.demo.util.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genre-main")
public class GenreMainController {

    @GetMapping("/fetch-master-data")
    public ResponseEntity<?> fetchGenreMain(
            @RequestParam(required = false) Integer id
    ) {
        // Service call will come later
        return ResponseEntity.ok("Fetch Genre Main called");
    }

    @PostMapping("/create-master-data")
    public ResponseEntity<?> createOrUpdateGenreMain(
            @RequestBody Object request
    ) {
        return ResponseEntity.ok("Create/Update/Delete Genre Main called");
    }
}

