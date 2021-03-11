package com.carzen.consultaplacas.controller;

import com.carzen.consultaplacas.model.Agregado;
import com.carzen.consultaplacas.model.Consulta;
import com.carzen.consultaplacas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value="/listConsult", method= RequestMethod.GET)
    public List<Consulta> listConsulta(){
        return consultaService.listConsulta();
    }

}
