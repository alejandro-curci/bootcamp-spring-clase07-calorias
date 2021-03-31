package com.inyeccionDependencia.demo.controller;

import com.inyeccionDependencia.demo.dto.ErrorDTO;
import com.inyeccionDependencia.demo.dto.PlatoComidaDTO;
import com.inyeccionDependencia.demo.dto.PlatosProcesadosDTO;
import com.inyeccionDependencia.demo.exceptionHandlers.IngredientNotFound;
import com.inyeccionDependencia.demo.services.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @PostMapping("/obtenerCalorias")
    public ResponseEntity obtenerCalorias(@RequestBody PlatoComidaDTO plato) throws IngredientNotFound {
        return new ResponseEntity(platoService.calcularTotalCalorias(plato), HttpStatus.OK);
    }

    @PostMapping("/listadoPlatos")
    public ResponseEntity obtenerListado(@RequestBody PlatosProcesadosDTO platos) throws IngredientNotFound {
        return new ResponseEntity(platoService.procesarComida(platos.getPlatos()), HttpStatus.OK);
    }

    @ExceptionHandler(IngredientNotFound.class)
    public ResponseEntity<ErrorDTO> handleException(IngredientNotFound e) {
        ErrorDTO errorDto = new ErrorDTO();
        errorDto.setName("Invalid Ingredient!");
        errorDto.setDescription("The ingredient "+e.getMessage()+" is invalid");
        return new ResponseEntity<ErrorDTO>(errorDto, HttpStatus.BAD_REQUEST);
    }

}
