package oop;

public class Car{
    // characteristics - fields - properties - data members (what? what kind of?)
    private double engine; // 8 BYTES
    private int year; // 4 BYTES
    private boolean electric; // 1 BYTE (или 2, спорно)
    private String[] colors; // 8 BYTES
    private int colorCode; // 4 BYTES
    private String brand = "HONDA"; // 8 BYTES
    private String model; // 8 BYTES
    private double price;
    //класс - как автоматизированный конвеер, который производит авто (на входе
    //закладываем характеристики, на выходе получаем автомоблить с этими характеристиками)

    //behavior - methods - поведение объектов класса и самого класса
    //1. object non static // чтобы пролучить доступ к методам non static нужно создать объект
    // и после этого через имя объекта обратиться к методу этого объекта
    public void toDrive() { // относится к машине (обращаемся через имя объекта
        System.out.println("Driving");
    } // описывает поведение объекта
    public void toStop() { // относится к машине
        System.out.println("Stoppingt");
    } // описывает поведение объекта
    //2. class static - функциональность самого класса, доступ к которой мы можем получить не создавая объекта
    public static void fire() { // система пожаротушения - относится к заводу (обращаемся через имя класса)
        System.out.println("Fire fighting");
    }
    // constructors
    // 1. defilt constructor
    public Car() { //дефолтный конструктор - генерируется автоматически
    }              // и инициализирует поля дефолтными значениями
    // 2. custom constructor
    public Car(int year) {
    /* если я напишу 2 раза "public oop.Car(){}" то будет ругаться
     или если "public static void fire(){}" тоже 2 раза то тоже будет ругаться
     но если я напишу один раз public static void fire(){} а второй раз
     public static void fire(int a){} - то это OVERLOAD (проявление полиморфизма)
     один и тот же метод с разными параметрами
     компилятор смотрит на тип (type) возвращаемого значения+имя (name) метода+тип параметра (parametr type)
     и если 2 метода с одинаковыми параетрами компилятор не понимает к какму методу обращаться
     савокупность этих параметров называется сигнатура метода (method signature)
     то есть эти методы отличаются сигнатурой */
        this.year = year;
        // если проинициализировать поле year, то ничегго не изменится,
        // потому что кастомный констурктор принимает параметр, но он с ним
        // ничего не делает (мы не присвоили никуда)
        // нудно написать this.year = year; в классе oop.Car.java, слово this содержит ссылку
        // на поле year того объекта, к которому мы применим данный конструктор
        // this - это переменная, в нее будет подставляться всякий раз ссылка на тот
        // объект, в отношение которого мы будем производить какие-то действия (вызываются методы)
    }
    public Car(double engine,boolean electric, int colorCode, String model) {
        this.engine = engine;
        this.electric = electric;
        this.colorCode = colorCode;
        this.model = model;
    }
    //под разные цели я могу сгенерировать разные конструкторы
    public Car(double engine, int year, int colorCode, String model) {
     //   this.engine = engine;
        setEngine(engine); // вызываем сеттер (если одинкавая логика проверки в констуркторе и в сеттере)
        if (year<1900) { // проверка, которая работает при работе констурктора
            return;}
        else{
            this.year = year;}
        this.colorCode = colorCode;
        this.model = model;
    }
    public void setEngine(double engine) {
        if (engine<0) {return;}
        this.engine = engine;
    }
    public Car withEngine(double engine) { // собираемся работать с объектом oop.Car
        if (engine < 0) return this; // возвращает ссылку на объект до изменений
        this.engine = engine; // this.engine название поля конкретно ЭТОГО ОБЪЕКТА, в отношение которого,
        // будет прменяться метод  withEngiтe. Присваиваем новое значение (если engine>0)
        return this; // вернули ссылку того объекта, в отношение которого мы вызываем этот метод после изменений
    }
    public void setYear (int year) {
        if (year<0) { // проверка которая работает при вызове сеттера
            return;} // верни значение которое в конструкторе
        else {
            this.year = year; // присвой то значение, которое просят присвоить
        }
    } public Car withYear (int year) {
        if (year<0) return this;
        this.year = year;
        return this;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }



    public double getEngine() {
        return engine;
    }
    public int getYear() {
        return year;
    }
    public boolean isElectric() {
        return electric;
    }
    public int getColorCode() {
        return colorCode;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "oop.Car{" +
                "engine=" + engine +
                ", year=" + year +
                ", electric=" + electric +
                ", colorCode=" + colorCode +
                ", brand=" + brand +
                ", model=" + model +
                ", price=" + price +
                '}';
    }


}

/*
человек, есть груз большой, он хочет отправить груз из израиля в США самолетом
в сам самолет его не пустят с грузом, таможня (setter) не пропустит
прверит и если все ок то на погрузку в самолет.
по прилету груз тоже отдает таможня (getter) - инкапсуляция

Х + []   customs --->    \________________} ---> customs ---> []
                                  class (plain)
 */