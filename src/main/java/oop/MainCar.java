package oop;

public class MainCar {
    public static void main(String[] args) {

        Car c = new Car();
        Car c1 = new Car(2020); // если проинициализировать поле year, то ничего
        // не изменится, потому что кастомный констурктор принимает параметр, но он с ним
        // ничего не делает (не присвоили никуда)
        // нудно написать this.year = year; в классе oop.Car.java, слово this содержит ссылку
        // на поле year того объекта, к которому мы применим данный конструктор
        // this - это переменная, в нее будет подставляться всякий раз ссылка на тот
        // объект, в отношение которого мы будем производить какие-то действия

        int[] ar = {3,7,6};

        System.out.println(c); // oop.Car@251a69d7 - адрес в переменной С
        System.out.println(c.getBrand());
        c.toDrive();
        Car.fire(); // обращаемся через имя класса, тк метод статичный

        System.out.println(ar);// [I@7344699f - адрес в переменной ar
        System.out.println(ar[1]);
        Car c2 = new Car(1.5,-2023,2,"Civic"); // Java смотрит,
        // какие у меня тут аргументы в скобках и смотрит, какой из имеющихся конструкторов
        // подходит для создания объекта с заданными наборов аргументов

        System.out.println(c2);
        // цепочка вызовов для констурктора
        Car c3 = new Car(); // объект с дефолтными значениями
        c3.setEngine(1.5); // через имя объекта вызываем методы
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(10000);

       // oop.Car c4 = new oop.Car().setYear(2022); // но сеттер ничего не возвращает (он VOID)
        Car c4 = new Car()
                .withEngine(1.8)
                .withYear(2022);

        System.out.println(c4);

        SportCar sc1 = new SportCar();
     //   System.out.println(sc1.);
        Truck t1 = new Truck();

        FormulaCar fc1 = new FormulaCar();

        fc1.sendSOS();
        Movable.anyMethod();
        fc1.otherMethod();

        Car c5 = new FormulaCar();
        Movable m1 = new FormulaCar();// создали объект класса oop.FormulaCar и положили ссылку на
                                      // него в переменную ссылочного типа m1 интерфейса (тип movable)
                                      // но засчет того, что у этого интерфейса есть имплементация в oop.FormulaCar
                                      // oop.FormulaCar наследует и от класса CAR и от интерфейса oop.FormulaCar

t1.toDrive();
sc1.toDrive();
fc1.toDrive();

Car[] cars = new Car[3];
cars[0] = t1;
cars[1] = sc1;
cars[2] = fc1;

for(Car car:cars) { //for each
    car.toDrive();

    Movable[] arr = new Movable[2];
    arr[0] = new FormulaCar(); // переменная ссылочного типа, в которой лежит ссылка на объект справа
    arr[1] = new Truck();

    for (Movable mov : arr){
        mov.sendSOS();

    }
}
    }
}
/*
          Stack                                  Heap

oop.Car c <--------------- reference ------------- {engine = 0.0
                                                year = 0
                                                electric = false
                                                colors = null
                                                colorCode = 0
                                                brand = HONDA
                                                model = null
                                                 }

oop.Car c1 <--------------- reference ------------- {engine = 0.0
                                                year = 0
                                                electric = false
                                                colors = null
                                                colorCode = 0
                                                brand = HONDA
                                                model = null
                                                 }

                      Inheritance
                                          oop.Movable abstract SOS signal (работать должно одинково)
           oop.Car                     Boat
      |            |           |          |
    Track       Speed oop.Car    FishBoat    SportBoat
      |            |        |        |     |
   oop.AutoTrain   oop.FormulaCar  Motor   Paddle  Jet
              |     |                       /
           length   |                   /
                    |             /
                    oop.Movable abstract SOS signal (работать должно одинково)

 interface oop.Movable
 sendSOS()
 имплементирвоать этот интерфейс в те классы, где он нужен!

 */