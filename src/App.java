import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import compraModelos.Articulo;
import compraModelos.Tarjeta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escrituraUsuario = new Scanner(System.in); 
        System.out.println("Escriba el Saldo de su Tarjeta: ");
        double creditoInicial = escrituraUsuario.nextDouble();
        Tarjeta tarjeta = new Tarjeta(creditoInicial);

        int opcionMenu = 0;
        
        
        while (opcionMenu != 2) {
        System.out.println("Credito disponible: " + tarjeta.getCreditoDisponible());    
        System.out.println("Ingrese el nombre del articulo a comprar: ");
        String nombreArticulo = escrituraUsuario.next();

        System.out.println("Ingrese el precio del articulo");
        double precioArticulo = Double.valueOf(escrituraUsuario.next());

      
        Articulo articulo = new Articulo(nombreArticulo, precioArticulo);
        boolean articuloComprado = tarjeta.comprarArticulo(articulo);

        if (articuloComprado) {
            System.out.println("Articulo agregado");
            System.out.println("Desea agregar otro articulo? 1. Si 2. No");
            opcionMenu = escrituraUsuario.nextInt();
        } else {
            System.out.println("Saldo insuficiente en la tarjeta");
            break;
        }



   

  }
  
System.out.println("*******LISTA DE COMPRAS*********");
  System.out.println("Articulos comprados:");
Collections.sort(tarjeta.getArticuloList());
  for (Articulo articulo : tarjeta.getArticuloList()) {
    System.out.println(articulo.toString());
  }

  System.out.println("Gracias por comprar");

    }
}
