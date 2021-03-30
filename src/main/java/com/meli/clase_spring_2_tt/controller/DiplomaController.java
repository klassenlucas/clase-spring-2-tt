package com.meli.clase_spring_2_tt.controller;

import com.meli.clase_spring_2_tt.dto.AlumnoDTO;
import com.meli.clase_spring_2_tt.service.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomaController {
    @PostMapping("diploma")
    public ResponseEntity obtenerDiploma(@RequestBody AlumnoDTO alumno) {
        return new ResponseEntity(DiplomaService.mapearDiploma(alumno), HttpStatus.OK);
    }
}
