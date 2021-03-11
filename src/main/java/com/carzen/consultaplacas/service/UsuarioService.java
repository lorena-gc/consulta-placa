package com.carzen.consultaplacas.service;

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

    public void createUsuario(UsuarioDTO dto){;
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        usuarioRepository.save(dto.toUsuario());
    }
}
