package com.example.carparts.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.carparts.CarPart;

@RestController
@RequestMapping("/api/carparts")
public class CarPartController {

    private final Map<Long, CarPart> carParts = new HashMap<>();
    private long nextId = 1;

    @GetMapping
    public Collection<CarPart> getAllParts() {
        return carParts.values();
    }

    @PostMapping
    public CarPart addPart(@RequestBody CarPart part) {
        part.setId(nextId++);
        carParts.put(part.getId(), part);
        return part;
    }

    @GetMapping("/{id}")
    public CarPart getPart(@PathVariable Long id) {
        return carParts.get(id);
    }

    @DeleteMapping("/{id}")
    public void deletePart(@PathVariable Long id) {
        carParts.remove(id);
    }

    @PutMapping("/{id}")
    public CarPart updatePart(@PathVariable Long id, @RequestBody CarPart updatedPart) {
        CarPart part = carParts.get(id);
        if (part != null) {
            updatedPart.setId(id);
            carParts.put(id, updatedPart);
        }
        return updatedPart;
    }
}
