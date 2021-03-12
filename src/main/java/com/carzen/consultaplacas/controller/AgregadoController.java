package com.carzen.consultaplacas.controller;

import com.carzen.consultaplacas.dto.AgregadoDTO;
import com.carzen.consultaplacas.dto.Response;
import com.carzen.consultaplacas.model.Agregado;
import com.carzen.consultaplacas.service.AgregadoService;
import com.carzen.consultaplacas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle")
public class AgregadoController {

    @Autowired
    AgregadoService agregadoService;

    @Autowired
    ConsultaService consultaService;

    @RequestMapping(value="/plate/{placa}", method= RequestMethod.GET)
    public ResponseEntity<?> findAgregadoByPlaca(@PathVariable("placa") String placa,
                                                 @RequestHeader("Authorization") String token){
        Agregado agregado = agregadoService.findAgregadoByPlaca(placa);
        consultaService.saveConsulta(placa, token);
        return ResponseEntity.ok(new Response(AgregadoDTO.from(agregado)));
    }

}
