package com.example.tareas.repository;

import com.example.tareas.mapper.TareaMapper;
import com.example.tareas.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TareaRepository {

    @Autowired
    private TareaMapper tareaMapper;

    public void save(Tarea tarea) {
        tareaMapper.insert(tarea);
    }

    public List<Tarea> findAll() {
        return tareaMapper.findAll();
    }

    public Tarea findById(Long id) {
        return tareaMapper.findById(id);
    }
}
