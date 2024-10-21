package org.example;

public class SingleResponsability {

    // La clase calculadora rompe el principio de responsabilidad unica, ya que no hace una cosa.

    public class calculadora{

        public static int suma(int a, int b){

            return a + b;
        }

        public static int resta(int a, int b){

            return a - b;
        }

    }

    //Aplicamos el principio de responsabilidad unica, para que cada clase solo haga una cosa.

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
