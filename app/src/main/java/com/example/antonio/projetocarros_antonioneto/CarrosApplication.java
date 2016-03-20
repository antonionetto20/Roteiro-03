package com.example.antonio.projetocarros_antonioneto;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by antonio on 16/03/2016.
 */
public class CarrosApplication extends Application {

    private List<Carro> carros;

    @Override
    public void onCreate() {
        super.onCreate();
        this.carros = new ArrayList<Carro>();
        criarCarrosPadrao();
    }

    private void criarCarrosPadrao(){
        this.carros.add(new Carro("BMW", R.drawable.bmw_720));
        this.carros.add(new Carro("CAMARO", R.drawable.camaro));
        this.carros.add(new Carro("CORVETTE", R.drawable.corvette));
        this.carros.add(new Carro("CT6", R.drawable.ct6));
        this.carros.add(new Carro("DB77", R.drawable.db77));
        this.carros.add(new Carro("GALLARDO", R.drawable.gallardo));
        this.carros.add(new Carro("MUSTANG", R.drawable.mustang));
        this.carros.add(new Carro("PAGANNI_ZONDA", R.drawable.paganni_zonda));
        this.carros.add(new Carro("PORSCHE_911", R.drawable.porsche_911));
        this.carros.add(new Carro("VYRON", R.drawable.vyron));

    }

    public List<Carro> getCarros() {
        return this.carros;
    }

    public void adicionarCarro(){
        Random random = new Random();
        this.carros.add(
                this.carros.get(
                        this.carros.size() > 1 ? random.nextInt(this.carros.size() - 1) : 0
                )
        );
    }

    public void removerCarro(int posicao){
        this.carros.remove(posicao);
    }

}
