package com.inyeccionDependencia.demo.services;

import com.inyeccionDependencia.demo.dto.CalculosResponseDTO;
import com.inyeccionDependencia.demo.dto.PlatoComidaDTO;

import java.util.List;

public interface PlatoService {
    public CalculosResponseDTO calcularTotalCalorias(PlatoComidaDTO plato);

    public List<CalculosResponseDTO> procesarComida(List<PlatoComidaDTO> platos);

}
