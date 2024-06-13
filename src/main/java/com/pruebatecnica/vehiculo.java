package com.pruebatecnica;

public class vehiculo {

    Integer matricula;
    String modelo;
    Integer potenciaCv;
    
    public vehiculo(Integer matricula, String modelo, Integer potenciaCv) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCv = potenciaCv;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    
}
