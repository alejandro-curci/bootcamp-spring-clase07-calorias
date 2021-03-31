package com.inyeccionDependencia.demo.repositories;

import com.inyeccionDependencia.demo.dto.IngredienteDTO;
import com.inyeccionDependencia.demo.dto.IngredienteResponseDTO;
import com.inyeccionDependencia.demo.exceptionHandlers.IngredientNotFound;

public interface IngredienteRepository {
    public IngredienteResponseDTO findCaloriesByName(String name) throws IngredientNotFound;
}
