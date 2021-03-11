package com.carzen.consultaplacas.controller;

import com.carzen.consultaplacas.model.Agregado;
import com.carzen.consultaplacas.service.AgregadoService;
import com.carzen.consultaplacas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle")
public class AgregadoController {

    @Autowired
    AgregadoService agregadoService;

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value="/plate/{placa}", method= RequestMethod.GET)
    public Agregado findAgregadoByPlaca(@PathVariable("placa") String placa,
                                        @RequestHeader("Authorization") String token){
        Agregado agregado = agregadoService.findAgregadoByPlaca(placa);
        consultaService.saveConsulta(placa, token);
        return agregado;
    }

}
