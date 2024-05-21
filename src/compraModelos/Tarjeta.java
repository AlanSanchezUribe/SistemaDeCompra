package compraModelos;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private double creditoDisponible;
    private double creditoInicial;
    private List<Articulo> articuloList;

    public Tarjeta(double creditoInicial) {
        this.creditoInicial = creditoInicial;
        this.creditoDisponible = creditoInicial;
        this.articuloList = new ArrayList<>();
        
    }

    public boolean comprarArticulo(Articulo articulo) {
        if (creditoDisponible >= articulo.getPrecio()) {
            creditoDisponible -= articulo.getPrecio();
            articuloList.add(articulo);
            return true;
        } else {
            return false;
        }
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

   

    public double getCreditoInicial() {
        return creditoInicial;
    }

    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    
}