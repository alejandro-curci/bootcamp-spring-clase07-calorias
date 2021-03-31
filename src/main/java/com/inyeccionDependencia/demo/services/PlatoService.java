package com.inyeccionDependencia.demo.services;

import com.inyeccionDependencia.demo.dto.CalculosResponseDTO;
import com.inyeccionDependencia.demo.dto.PlatoComidaDTO;
import com.inyeccionDependencia.demo.exceptionHandlers.IngredientNotFound;

import java.util.List;

public interface PlatoService {
    public CalculosResponseDTO calcularTotalCalorias(PlatoComidaDTO plato) throws IngredientNotFound;

    public List<CalculosResponseDTO> procesarComida(List<PlatoComidaDTO> platos) throws IngredientNotFound;

}
