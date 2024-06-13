package com.pruebatecnica;

public class autobus extends vehiculo{

    String numeroplazas;

    public autobus(Integer matricula, String modelo, Integer potenciaCv, String numeroplazas) {
        super(matricula, modelo, potenciaCv);
        this.numeroplazas = numeroplazas;
    }

    public String getNumeroplazas() {
        return numeroplazas;
    }

    public void setNumeroplazas(String numeroplazas) {
        this.numeroplazas = numeroplazas;
    }
    
   

}
