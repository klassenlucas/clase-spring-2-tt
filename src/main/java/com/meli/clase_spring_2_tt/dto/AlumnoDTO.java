package com.meli.clase_spring_2_tt.dto;

import java.util.List;

public class AlumnoDTO {
    private List<AsignaturaAprobadaDTO> asignaturasAprobadas;
    private String nombre;

    public AlumnoDTO(List<AsignaturaAprobadaDTO> asignaturasAprobadas, String nombre) {
        this.asignaturasAprobadas = asignaturasAprobadas;
        this.nombre = nombre;
    }

    public List<AsignaturaAprobadaDTO> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public void setAsignaturasAprobadas(List<AsignaturaAprobadaDTO> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
