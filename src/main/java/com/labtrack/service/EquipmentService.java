package com.labtrack.service;

import com.labtrack.model.Equipment;
import com.labtrack.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    private final EquipmentRepository repo;

    public EquipmentService(EquipmentRepository repo) {
        this.repo = repo;
    }

    public List<Equipment> getAll() {
        return repo.findAll();
    }

    public Equipment save(Equipment eq) {
        return repo.save(eq);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Equipment update(Long id, Equipment eq) {
        eq.setId(id);
        return repo.save(eq);
    }
}