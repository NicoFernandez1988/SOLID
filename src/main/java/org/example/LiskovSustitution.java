package org.example;

public class LiskovSustitution {

    /**
      Este principio indica que las clases hijas o subclases deben poder comportarse de la misma forma que las
      clases padre.
     */

    public abstract static class  Vehiculo {

        public abstract void conducir();

    }

    public static class Auto extends Vehiculo{

        @Override
        public void conducir() {
            System.out.println("Conducir un auto");
        }
    }

    public class Camion extends Vehiculo{

        @Override
        public void conducir() {
            System.out.println("Conducir un camion");
        }
    }

    /**
     * Avion es una subclase de vehiculo, pero no deberia serlo ya que no se puede conducir, se puede volar.
     * De esta forma no cumple con el principio de sustitucion de Liskov.
     * En este caso, la solucion seria crear otra clase abstracta padre llamada "VehiculoAire", que tenga un metodo
     * para los vehiculos que vuelan. Para que la subclase Avion extienda de VehiculoAire.
     */

    public class Avion extends Vehiculo{

        @Override
        public void conducir(){
            System.out.println("Debería lanzar una excepcion de no implementacion");
        }
    }

    public class programa{

        public static void probarConduccion(Vehiculo vehiculo){
            vehiculo.conducir();
        }

        public void main(String[] args) {

            var auto = new Auto();
            probarConduccion(auto);

            var camion = new Camion();
            probarConduccion(camion);

            var avion = new Avion();
            probarConduccion(avion);

        }
    }

}



