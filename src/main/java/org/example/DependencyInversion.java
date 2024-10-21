package org.example;

public class DependencyInversion {

    /**
     Este principio Indica que los modulos de alto nivel no deben depender de los modulos de bajo nivel, sino que
     ambos deben depender de abstracciones.
     */


    public interface INaveEspacial{

        void despegar();
        void aterrizar();

    }

    // Modulo de Alto nivel que depende de la abstraccion.

    public static class SistemaControlDeNaves{

        /**
         Todas las naves espaciales que implementan la interfaz INaveEspacial pueden ser operadas por el sistema
         de control de naves.
         Se inyecta la dependencia de INaveEspacial
         */

        private final INaveEspacial iNaveEspacial;

        public SistemaControlDeNaves(INaveEspacial iNaveEspacial) {
            this.iNaveEspacial = iNaveEspacial;
        }

        public void operarNave(){

            iNaveEspacial.despegar();
            iNaveEspacial.aterrizar();
        }

        // Modulos de bajo nivel, las naves.

        public static class NaveCaza implements INaveEspacial{

            @Override
            public void despegar() {
                System.out.println("Nave caza despegando");
            }

            @Override
            public void aterrizar() {
                System.out.println("Nave caza aterrizando");
            }
        }

        public static class NaveRecolectora implements INaveEspacial{

            @Override
            public void despegar() {
                System.out.println("Nave recolectora despegando");
            }

            @Override
            public void aterrizar() {
                System.out.println("Nave recolectora aterrizando");
            }
        }
    }
}
