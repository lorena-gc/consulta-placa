package com.carzen.consultaplacas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agregados")
public class Agregado {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "placa_modelo_antigo")
    private String placa_antiga;

    @Column(name = "placa_modelo_novo")
    private String placa_nova;

    @Column(name = "chassi")
    private String chassi;

    @Column(name = "ano_fabricacao")
    private Long ano_fabricacao;

    @Column(name = "ano_modelo")
    private Long ano_modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca_antiga() {
        return placa_antiga;
    }

    public void setPlaca_antiga(String placa_antiga) {
        this.placa_antiga = placa_antiga;
    }

    public String getPlaca_nova() {
        return placa_nova;
    }

    public void setPlaca_nova(String placa_nova) {
        this.placa_nova = placa_nova;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Long getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(Long ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public Long getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(Long ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}