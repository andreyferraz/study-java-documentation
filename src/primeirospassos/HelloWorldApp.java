package primeirospassos;

/*
 * A classe HelloWorldApp implementa na aplicação
 * uma simples impressão de "Hello World!" na saída padrão. 
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        /*
         * Primeiro código
         */
        System.out.println("Hello World");

        /*
         * Exercício 1: Altere o programa HelloWorldApp.java
         * para que ele seja exibido em vez de .Hola Mundo!Hello World!
         */
        System.out.println("Hola Mundo!");

        /*
         * 
         * Exercício 2: O programa tem um erro. 
         * Corrija o erro para que o programa seja compilado e executado com êxito. 
         * Qual foi o erro?
         * class HelloWorldApp2 {
         * public static void main(String[] args) {
         * System.out.println("Hello World!); 
         * }
         * }
         * 
         * Não vai rodar pois está faltando o fechamento das aspas duplas 
         * na string Hello World!
         * Vai dá o erro "Exception in thread "main" java.lang.Error: 
         * Unresolved compilation problem: String literal is not properly closed by a double-quote"
         */
    }
}
