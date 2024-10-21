package org.example;

public class IntefaceSegregation {

    /**
     Este principio indica los clientes no deberían verse obligados a depender de interfaces que no usan.
     De esta forma, en lugar de crear interfaces grandes que contengan métodos que no todos los clientes
     necesitan, se deben dividir en interfaces más específicas, enfocadas en conjuntos de funcionalidades concretas.
     Así, cada cliente solo dependerá de los métodos que realmente necesita.
     */

    public interface Animal{

        static void ladrar(){
            System.out.println("El animal ladra");
        }

        static void maullar(){
            System.out.println("El animal maulla");
        }
    }

    /**
     Como el perro no puede maullar, no deberia implementar la interfaz si no va a utilizar el metodo maullar.
     De esta forma viola el principio de segregacion de intefaz.
     */


    public class Perro implements Animal {

        public void ladrar(){
            System.out.println("El perro ladra");
        }

        public void maullar(){
            //El perro no puede maullar.
        }
    }

    //Aqui sucede lo mismo con el gato, que no puede ladrar.

    public class Gato implements Animal {

        public void ladrar(){
            //El gato no puede ladrar
        }

        public void maullar(){
            System.out.println("El gato maulla");

        }
    }

    /**
     La forma correcta de hacerlo es crear 2 interfaces que una tenga el metodo ladrar y la otra maullar.
     En donde cada animal solo implemente la intefaz correspondiente para los metodos que necesita.
     */


    public interface AnimalLadrador{

        static void ladrar(){
            System.out.println("El animal ladra");
        }
    }

    public interface AnimalMaullador{

        static void maullar(){
            System.out.println("El animal maulla");
        }
    }

    public class Perro2 implements AnimalLadrador{

        public void ladrar(){
            System.out.println("El perro ladra");
        }
    }

    public class Gato2 implements AnimalMaullador{

        public void maullar(){
            System.out.println("El gato maulla");
        }
    }
}
