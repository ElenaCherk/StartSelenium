package oop;

public interface Movable {
    // double length = 3.5; // константа (плоха для параметра length), не можем ее изменить, лучше тут не объявлять
    void sendSOS();
    static void anyMethod(){
        System.out.println("Any method"); // обращаемся к этому методу через имя интерфейса (тк он static)
    }
    default void otherMethod(){
        System.out.println("Other method"); //этот метод будет доступен в объекте класса CAR (oop.FormulaCar)
    }

}
