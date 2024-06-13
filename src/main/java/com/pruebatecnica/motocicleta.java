package com.pruebatecnica;

//si se extiende de vehiculo ya que comparte atributos que los hacen ser parecidos

public class motocicleta extends vehiculo{

    String cilindrajeMoto;

    public motocicleta(Integer matricula, String modelo, Integer potenciaCv) {
        super(matricula, modelo, potenciaCv);
    }

    public String getCilindrajeMoto() {
        return cilindrajeMoto;
    }

    public void setCilindrajeMoto(String cilindrajeMoto) {
        this.cilindrajeMoto = cilindrajeMoto;
    }

}
