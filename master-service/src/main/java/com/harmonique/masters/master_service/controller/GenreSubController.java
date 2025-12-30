package com.harmonique.masters.master_service.controller;

import com.example.demo.util.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/genre-sub")
public class GenreSubController {
    @GetMapping("/fetch-master-data")
    public ResponseEntity<?> fetchGenreSub(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) Integer parentId
    ) {
        return ResponseEntity.ok("Fetch Genre Sub called");
    }

    @PostMapping("/create-master-data")
    public ResponseEntity<?> createOrUpdateGenreSub(
            @RequestBody Object request
    ) {
        return ResponseEntity.ok("Create/Update/Delete Genre Sub called");
    }
}
