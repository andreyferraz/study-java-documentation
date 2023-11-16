package orientacaoobjetos.exercicios;

public class MesaDemo {
    public static void main(String[] args) {
        
        Mesa mesa = new MesaDeMadeira();
        mesa.colocar();
        mesa.pintar("Azul");
        mesa.limpar();
        mesa.retirar();

        ((MesaDeMadeira) mesa).print();
    }
}
