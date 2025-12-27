package com.harmonique.masters.master_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/instrument-main")
public class InstrumentMainController {

    @GetMapping("/fetch-master-data")
    public ResponseEntity<?> fetchInstrumentMain(
            @RequestParam(required = false) Integer id
    ) {
        return ResponseEntity.ok("Fetch Instrument Main called");
    }

    @PostMapping("/create-master-data")
    public ResponseEntity<?> createOrUpdateInstrumentMain(
            @RequestBody Object request
    ) {
        return ResponseEntity.ok("Create/Update/Delete Instrument Main called");
    }
}

