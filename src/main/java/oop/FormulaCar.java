package oop;

public class FormulaCar extends SportCar implements Movable{
    private double length;
    @Override
    public void sendSOS() {
        System.out.println("sending sos signal formulaCar");
    }
}
