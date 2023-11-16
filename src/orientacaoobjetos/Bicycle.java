package orientacaoobjetos;
/*
 * Implementação de uma classe de um objeto bicicleta
 * onde seus atributos não são privados
 */
public interface Bicycle {

    public void changeCadence(int newValue);
 
    public void changeGear(int newValue);

    public void speedUp(int increment);

    public void applyBrakes(int decrement);

}
