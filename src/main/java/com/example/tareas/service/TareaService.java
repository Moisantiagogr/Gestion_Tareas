package com.example.tareas.service;

import com.example.tareas.mapper.TareaMapper;
import com.example.tareas.model.Tarea;
import com.example.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    @Transactional
    public void insert(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    @Transactional(readOnly = true)
    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Tarea getTareaById(Long id) {
        return tareaRepository.findById(id);
    }

}
