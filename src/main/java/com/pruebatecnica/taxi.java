package com.pruebatecnica;

public class taxi extends vehiculo{


    Integer numeroLicencia;

   public taxi(Integer matricula, String modelo, Integer potenciaCv) {
        super(matricula, modelo, potenciaCv);
    }

public Integer getNumeroLicencia() {
    return numeroLicencia;
}

public void setNumeroLicencia(Integer numeroLicencia) {
    this.numeroLicencia = numeroLicencia;
}

    
}
