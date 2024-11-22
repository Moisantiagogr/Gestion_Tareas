package com.example.tareas.mapper;

import com.example.tareas.model.Tarea;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TareaMapper {
    @Insert("INSERT INTO tarea (nombre, descripcion, fecha_inicio) VALUES (#{nombre}, #{descripcion}, #{fechaInicio})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Tarea tarea);

    @Select("SELECT * FROM tarea")
    List<Tarea> findAll();

    @Select("SELECT * FROM tarea WHERE id = #{id}")
    Tarea findById(Long id);
}