package oop;

public class Truck extends Car implements Movable{

    private double weight;
    @Override
    public void toDrive (){
        super.toDrive();
        System.out.println("Very slow");
    }

    @Override
    public void sendSOS() {
        System.out.println("Sending SOS signal from Track");
    }
}
