package com.carzen.consultaplacas.controller;

import com.carzen.consultaplacas.dto.ConsultaDTO;
import com.carzen.consultaplacas.dto.Response;
import com.carzen.consultaplacas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping(value = "/vehicle")
public class ConsultaController {

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value="/listConsult", method= RequestMethod.GET)
    public ResponseEntity<?> listConsulta(){
        ArrayList<ConsultaDTO> consultas = (ArrayList<ConsultaDTO>) consultaService.listConsulta();
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", consultas);
        map.put("count", consultas.size());
        return ResponseEntity.ok(new Response(map));
    }

}
