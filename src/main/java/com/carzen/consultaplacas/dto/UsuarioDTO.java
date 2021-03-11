package com.carzen.consultaplacas.dto;

import com.carzen.consultaplacas.model.Usuario;

public class UsuarioDTO {

    private String email;
    private String password;

    public UsuarioDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario toUsuario (){
        Usuario usuario = new Usuario();
        usuario.setEmail(getEmail());
        usuario.setPassword(getPassword());
        return usuario;
    }
}
