package oop;

public class MainTVs {
    public static void main(String[] args) {
        TVs tv1 = new TVs()
                .withBrand("LG")
                .withModel("TD-346")
                .withYear(2021)
                .withSize(50)
                .withPrice(4500);
        TVs tv2 = new TVs()
                .withBrand("SONY")
                .withModel("SP-34-56")
                .withYear(2019)
                .withSize(55)
                .withPrice(2490.90);
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
