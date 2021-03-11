package com.carzen.consultaplacas.repository;

import com.carzen.consultaplacas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT u FROM Usuario u WHERE u.email = ?1 ")
    Usuario findUsuarioByEmail(String email);

}
