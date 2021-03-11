package com.carzen.consultaplacas.repository;

import com.carzen.consultaplacas.model.Agregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgregadoRepository extends JpaRepository<Agregado, Long> {

    @Query(value = "SELECT a FROM Agregado a WHERE a.placa like %?1% ")
    Agregado findAgregadoByPlaca(String placa);

}
