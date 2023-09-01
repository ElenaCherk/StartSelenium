package this_methods;

public class Calc {
    int a;
    int b;
    static int res = 0;
     public static void printRes(){
       System.out.println ("Result = " + res);

}
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate (int a, int b, char action){ //с помощью
         // метода изменили статическую переменную res
         switch (action){
        case '+': res = this.a + this.b; break; //будет складываться 4 и 5
        case '-': res = a - b; break;
    }
     return res;
     }
}
