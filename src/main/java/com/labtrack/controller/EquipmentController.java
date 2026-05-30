package com.labtrack.controller;

import com.labtrack.model.Equipment;
import com.labtrack.service.EquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
@CrossOrigin
public class EquipmentController {

    private final EquipmentService service;

    public EquipmentController(EquipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Equipment> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Equipment add(@RequestBody Equipment eq) {
        return service.save(eq);
    }

    @PutMapping("/{id}")
    public Equipment update(@PathVariable Long id, @RequestBody Equipment eq) {
        return service.update(id, eq);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}