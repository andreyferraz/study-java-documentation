package orientacaoobjetos;

public class BicycleDemo {
    public static void main(String[] args) {
        //criando dois objetos da classe Bicycle
        Bicycle bike1 = new ACMEBicycle();
        Bicycle bike2 = new ACMEBicycle(); 
        
        //Invocando os métodos desses objetos
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        ((ACMEBicycle) bike1).printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        ((ACMEBicycle)bike2).printStates();
    }
}
