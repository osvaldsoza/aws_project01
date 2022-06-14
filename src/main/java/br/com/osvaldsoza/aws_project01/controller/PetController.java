package br.com.osvaldsoza.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/pet")
@RestController
public class PetController {

    private static final Logger LOG = LoggerFactory.getLogger(PetController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> petTest(@PathVariable("name") String name) {
        LOG.info("test controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }
}
