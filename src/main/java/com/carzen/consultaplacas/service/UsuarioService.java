package com.carzen.consultaplacas.service;

import com.carzen.consultaplacas.dto.Response;
import com.carzen.consultaplacas.dto.UsuarioDTO;
import com.carzen.consultaplacas.model.Usuario;
import com.carzen.consultaplacas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario findUsuarioByEmail(String email){;
        return usuarioRepository.findUsuarioByEmail(email);
    }

    public Response createUsuario(UsuarioDTO dto){
        if(usuarioRepository.findUsuarioByEmail(dto.getEmail()) != null)
            return new Response("CRIACAO_USUARIO", "Usuario existente", "ERROR");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        usuarioRepository.save(dto.toUsuario());
        return new Response("CRIACAO_USUARIO", "Usuario criado com sucesso", "SUCCESS");
    }
}
