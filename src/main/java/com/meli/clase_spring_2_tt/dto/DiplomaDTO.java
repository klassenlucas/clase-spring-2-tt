package com.meli.clase_spring_2_tt.dto;

public class DiplomaDTO {
    private String mensaje;
    private double promedio;
    private AlumnoDTO alumno;

    public DiplomaDTO(String mensaje, double promedio, AlumnoDTO alumno) {
        this.mensaje = mensaje;
        this.promedio = promedio;
        this.alumno = alumno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public AlumnoDTO getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDTO alumno) {
        this.alumno = alumno;
    }
}
