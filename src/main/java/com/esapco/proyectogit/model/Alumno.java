package com.esapco.proyectogit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {
   
    private Integer id;
    private String nombre;
    private String direccion;
    private String escuela;
    private String matricula;

    
}
