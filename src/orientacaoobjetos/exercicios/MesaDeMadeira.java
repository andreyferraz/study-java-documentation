package orientacaoobjetos.exercicios;

public class MesaDeMadeira implements Mesa{
    int comprimento = 2;
    int largura = 1;
    int altura = 1;
    String cor = "branca";

    public void retirar(){
        System.out.println("Mesa de Madeira retirada");
    }
    public void colocar(){
        System.out.println("Mesa de Madeira colocada");
    }
    public void limpar(){
        System.out.println("Mesa de Madeira limpa");
    }
    public void pintar(String cor){
        this.cor = cor;
        System.out.println("Mesa de Madeira pintada");
    }
    public void print(){
        System.out.println("Mesa de Madeira");
        System.out.println("comprimento: " + comprimento);
        System.out.println("largura: " + largura);
        System.out.println("altura: " + altura);
        System.out.println("cor: " + cor);
    }

}
