package org.example;

import java.util.Objects;

public class OpenClose {

    // La clase calculadoraDescuento rompe el principio de abierto cerrado, ya que se encuentra abierto para su
    // modificacion.

    public class calculadoraDescuentoErronea{

        public static double aplicarDescuento(double precio, String producto){
            if (Objects.equals(producto, "Electronica")){
                //Aplica descuento del 20% si el producto es  de Electronica
                return precio * 0.8;
            }else if (Objects.equals(producto, "Indumentaria")){
                //Aplica descuento del 10% si el producto es  de Indumentaria
                return precio  * 0.9;
            }else{
                return precio;
            }
        }

    }

    // Se crea una interfaz descuento para no dejar la clase abierta para su modificacion, sino que queda abierta
    // solo para su extension;

    public interface Descuento{
        double aplicarDescuento(double precio);
    }

    public static class descuentoElectronica implements Descuento{

        @Override
        public double aplicarDescuento(double precio) {
            return precio * 0.8;
        }
    }

    public static class descuentoIndumentaria implements Descuento{

        @Override
        public double aplicarDescuento(double precio) {
            return precio * 0.9;
        }
    }

    public static class sinDescuento implements Descuento{

        @Override
        public double aplicarDescuento(double precio) {
            return precio;
        }
    }

    public static class calculadoraDescuentoCorrecta{

        public double calculadoraDescuento(Descuento descuento, double precio){
           return descuento.aplicarDescuento(precio);
        }
    }
}
