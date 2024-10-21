package org.example;

public class SingleResponsability {

    /**
      El principio de responsabilidad unica, como su nombre lo indica, deber asegurar que cada clase solo haga una cosa.
      En este caso, la clase calculadora rompe este principio.
     */

    public class calculadora{

        public static int suma(int a, int b){

            return a + b;
        }

        public static int resta(int a, int b){

            return a - b;
        }

    }

    //Aplicamos el principio de responsabilidad unica, para que cada clase solo tenga una responsabilidad.

    public static class calculadoraSuma{

        public static int sumar(int a, int b){

            return a + b;
        }

    }

    public static class calculadoraResta{

        public static int restar(int a, int b){

            return a + b;
        }

    }

    //El principio de responsabilidad unica tambien debe aplicarse a los metodos.


}
