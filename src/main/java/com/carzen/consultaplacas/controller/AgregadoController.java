package com.carzen.consultaplacas.controller;

import com.carzen.consultaplacas.model.Agregado;
import com.carzen.consultaplacas.service.AgregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehicle")
public class AgregadoController {

    @Autowired
    AgregadoService agregadoService;

    @RequestMapping(value="/plate/{placa}", method= RequestMethod.GET)
    public Agregado findAgregadoByPlaca(@PathVariable("placa") String placa){
        return agregadoService.findAgregadoByPlaca(placa);
    }

}
