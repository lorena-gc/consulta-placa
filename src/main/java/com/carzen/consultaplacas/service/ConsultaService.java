package com.carzen.consultaplacas.service;

import com.carzen.consultaplacas.config.jwt.JwtTokenUtil;
import com.carzen.consultaplacas.model.Consulta;
import com.carzen.consultaplacas.model.Usuario;
import com.carzen.consultaplacas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository consultaRepository;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    public void saveConsulta(String placa, String token){
        Consulta consulta = new Consulta();
        consulta.setDate(new Date());
        consulta.setPlaca(placa);
        consulta.setUsuario(usuarioService.findUsuarioByEmail(jwtTokenUtil.getUsernameFromToken(token)));
        consultaRepository.save(consulta);
    }

    public List<Consulta> listConsulta(){
        consultaRepository.count();
        return consultaRepository.findAll();
    }

}
