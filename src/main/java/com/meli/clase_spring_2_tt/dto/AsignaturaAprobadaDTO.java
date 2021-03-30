package com.meli.clase_spring_2_tt.dto;

public class AsignaturaAprobadaDTO {
    private String nombre;
    private int nota;

    public AsignaturaAprobadaDTO(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
