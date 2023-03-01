package org.example;

import java.util.HashMap;

public  class Mapas<T,N>{
    HashMap<T,N> mapas = new  HashMap<>();
    public void ideti(T raktas, N reiksme){
        mapas.put(raktas,reiksme);
    }
    public  N gauti(T raktas){
        return mapas.get(raktas);
    }
}
