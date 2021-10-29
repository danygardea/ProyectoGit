package com.esapco.proyectogit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materia {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String notas;
}
