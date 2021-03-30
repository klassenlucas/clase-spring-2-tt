package com.meli.clase_spring_2_tt.service;

import com.meli.clase_spring_2_tt.dto.AlumnoDTO;
import com.meli.clase_spring_2_tt.dto.DiplomaDTO;

import static java.util.stream.Collectors.averagingDouble;

public class DiplomaService {

    public static DiplomaDTO mapearDiploma(AlumnoDTO alumno) {
        return new DiplomaDTO(obtenerMensaje(alumno),obtenerPromedio(alumno),alumno);
    }

    private static String obtenerMensaje(AlumnoDTO alumno) {
        String mensaje = "El alumno " + alumno.getNombre() + " se ha recibido con un promedio de " + obtenerPromedio(alumno) + ".";
        return obtenerPromedio(alumno) >= 9 ? mensaje + " ¡Felicitaciones!" : mensaje;
    }

    private static double obtenerPromedio(AlumnoDTO alumno) {
        return alumno.getAsignaturasAprobadas().stream().collect(averagingDouble(a -> a.getNota()));
    }
}
