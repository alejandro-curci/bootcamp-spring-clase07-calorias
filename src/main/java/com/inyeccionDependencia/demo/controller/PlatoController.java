package com.inyeccionDependencia.demo.controller;

import com.inyeccionDependencia.demo.dto.PlatoComidaDTO;
import com.inyeccionDependencia.demo.dto.PlatosProcesadosDTO;
import com.inyeccionDependencia.demo.services.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @PostMapping("/obtenerCalorias")
    public ResponseEntity obtenerCalorias(@RequestBody PlatoComidaDTO plato){
        return new ResponseEntity(platoService.calcularTotalCalorias(plato), HttpStatus.OK);
    }

    @PostMapping("/listadoPlatos")
    public ResponseEntity obtenerListado(@RequestBody PlatosProcesadosDTO platos){
        return new ResponseEntity(platoService.procesarComida(platos.getPlatos()), HttpStatus.OK);
    }

}
