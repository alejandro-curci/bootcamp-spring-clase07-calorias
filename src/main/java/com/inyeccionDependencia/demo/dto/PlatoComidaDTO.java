package com.inyeccionDependencia.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class PlatoComidaDTO {
    private String nombre;
    private List<IngredienteDTO> ingredientes;
}
