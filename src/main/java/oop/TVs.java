package oop;

public class TVs {
    private String brand;
    private String model;
    private int year;
    private int size;
    private double price;

    public TVs() {
        if (brand == null || model == null || year == 0 || size >= 0) {
            return;
        } else {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.size = size;
        }
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null)
        {return;}
        this.brand = brand;
    }
    public TVs withBrand(String brand) {
        if (brand == null)
        return this;
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null)
        {return;}
        this.model = model;
    }
    public TVs withModel(String model) {
        if (model == null)
        {return this;}
        this.model = model;
        return this;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <=0)
        {return;}
        this.year = year;
    }
    public TVs withYear(int year) {
        if (year <=0)
        {return this;}
        this.year = year;
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <=0)
        {return;}
        this.size = size;
    }
    public TVs withSize(int size) {
        if (size <=0)
        {return this;}
        this.size = size;
        return this;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0)
        {return;}
        this.price = price;
    }
    public TVs withPrice(double price) {
        if (price<=0)
        {return this;}
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "oop.TVs {" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", size = " + size + " inches" +
                ", price = " + price  + " NIS" +
                '}';
    }
}
