package oop;

public class SportCar extends Car{
    private double acceleration;
    @Override
    public void toDrive (){
        super.toDrive();
        System.out.println("Very fast");
    }
}
