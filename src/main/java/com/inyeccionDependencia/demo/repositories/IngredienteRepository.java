package com.inyeccionDependencia.demo.repositories;

import com.inyeccionDependencia.demo.dto.IngredienteDTO;
import com.inyeccionDependencia.demo.dto.IngredienteResponseDTO;

public interface IngredienteRepository {
    public IngredienteResponseDTO findCaloriesByName(String name);
}
