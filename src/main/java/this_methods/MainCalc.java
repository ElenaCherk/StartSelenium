package this_methods;

import this_methods.Calc;

public class MainCalc {

    public MainCalc() {
    }
    public static void main(String[] args) {
        Calc.printRes();
        Calc c = new Calc(4,6); // построили объект с полями a и b
        Calc c1 = new Calc(3,7);
        c1.calculate(2,5,'+'); // тут передаем другие значени для a и b
    Calc.printRes();



    }
    public void printAny(){
        System.out.println("Any");
    }
}
