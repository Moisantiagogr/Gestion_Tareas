package com.example.tareas.controller;

import com.example.tareas.model.Tarea;
import com.example.tareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "*")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @PostMapping
    public ResponseEntity<Void> createTarea(@RequestBody Tarea tarea) {
        tareaService.insert(tarea);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Tarea>> getAllTareas() {
        return ResponseEntity.ok(tareaService.getAllTareas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarea> getTareaById(@PathVariable Long id) {
        return ResponseEntity.ok(tareaService.getTareaById(id));
    }
}