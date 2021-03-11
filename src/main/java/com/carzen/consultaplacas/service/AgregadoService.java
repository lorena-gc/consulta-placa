package com.carzen.consultaplacas.service;

import com.carzen.consultaplacas.model.Agregado;
import com.carzen.consultaplacas.repository.AgregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgregadoService {

    @Autowired
    AgregadoRepository agregadoRepository;

    public Agregado findAgregadoByPlaca(String placa){;
        return agregadoRepository.findAgregadoByPlaca(placa);
    }
}
