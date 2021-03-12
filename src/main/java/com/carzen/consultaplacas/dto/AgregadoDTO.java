package com.carzen.consultaplacas.dto;

import com.carzen.consultaplacas.model.Agregado;

public class AgregadoDTO {

    private String msg;
    private String plate;
    private String chassis;
    private String brand;
    private String model;
    private String color;
    private Long yearManufactur;
    private Long yearModelo;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getYearManufactur() {
        return yearManufactur;
    }

    public void setYearManufactur(Long yearManufactur) {
        this.yearManufactur = yearManufactur;
    }

    public Long getYearModelo() {
        return yearModelo;
    }

    public void setYearModelo(Long yearModelo) {
        this.yearModelo = yearModelo;
    }

    public static AgregadoDTO from(Agregado entity){
        AgregadoDTO dto = new AgregadoDTO();
        if(entity == null){
            dto.setMsg("Agregado nao encontrado.");
            return dto;
        }
        dto.setBrand(entity.getMarca());
        dto.setChassis(entity.getChassi());
        dto.setMsg("Sem erros.");
        String str = entity.getChassi().substring(0, 12);
        dto.setChassis(entity.getChassi().replace(str, "*****"));
        dto.setColor(entity.getCor());
        dto.setPlate(entity.getPlaca());
        dto.setYearManufactur(entity.getAno_fabricacao());
        dto.setYearModelo(entity.getAno_modelo());
        dto.setModel(entity.getModelo());

        return dto;
    }
}
