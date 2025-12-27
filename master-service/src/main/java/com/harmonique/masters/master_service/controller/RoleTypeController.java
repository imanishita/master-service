package com.harmonique.masters.master_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;@RestController
@RequestMapping("/role-type")
public class RoleTypeController {

    @GetMapping("/fetch-master-data")
    public ResponseEntity<?> fetchInstrumentTypes(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) Integer instrumentMainId
    ) {
        return ResponseEntity.ok("Fetch Instrument Type called");
    }

    @PostMapping("/create-master-data")
    public ResponseEntity<?> createOrUpdateInstrumentType(
            @RequestBody Object request
    ) {
        return ResponseEntity.ok("Create/Update/Delete Instrument Type called");
    }
}
