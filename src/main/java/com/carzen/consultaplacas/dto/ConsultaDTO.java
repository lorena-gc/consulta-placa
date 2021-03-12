package com.carzen.consultaplacas.dto;

import com.carzen.consultaplacas.model.Consulta;
import com.carzen.consultaplacas.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ConsultaDTO {

    private Long id;
    private String plate;
    private Long date;
    private Usuario user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public static ConsultaDTO from(Consulta entity){
        ConsultaDTO dto = new ConsultaDTO();
        if(entity == null)
            return dto;
        dto.setId(entity.getId());
        dto.setPlate(entity.getPlaca());
        dto.setDate(entity.getDate().getTime());
        dto.setUser(entity.getUsuario());
        return dto;
    }

    public static List<ConsultaDTO> from(List<Consulta> consultas){
        List<ConsultaDTO> dtos = new ArrayList<>();
        for (Consulta entity: consultas){
            dtos.add(from(entity));
        }
        return dtos;
    }

}
