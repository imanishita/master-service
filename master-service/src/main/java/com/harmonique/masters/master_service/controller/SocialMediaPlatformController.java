package com.harmonique.masters.master_service.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/social-media-platform")
public class SocialMediaPlatformController {

    @GetMapping("/fetch-master-data")
    public ResponseEntity<?> fetchSocialMediaPlatforms(
            @RequestParam(required = false) Integer id
    ) {
        return ResponseEntity.ok("Fetch Social Media Platform called");
    }

    @PostMapping("/create-master-data")
    public ResponseEntity<?> createOrUpdateSocialMediaPlatform(
            @RequestBody Object request
    ) {
        return ResponseEntity.ok("Create/Update/Delete Social Media Platform called");
    }
}
