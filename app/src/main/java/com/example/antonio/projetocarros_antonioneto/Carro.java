package com.example.antonio.projetocarros_antonioneto;

/**
 * Created by antonio on 16/03/2016.
 */
public class Carro {

    private String nomeCarro;
    private int idImageCarro;

    public Carro(String nomeCarro, int idImageCarro) {
        this.nomeCarro = nomeCarro;
        this.idImageCarro = idImageCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getIdImageCarro() {
        return idImageCarro;
    }

    public void setIdImageCarro(int idImageCarro) {
        this.idImageCarro = idImageCarro;
    }
}
