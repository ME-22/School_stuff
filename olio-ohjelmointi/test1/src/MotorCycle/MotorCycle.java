package MotorCycle;
public class MotorCycle {
    private String brand;
    private String type;
    private int price;

    public MotorCycle(String brand, String type, int price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public String setBrand(String brand){
        this.brand = brand;
        return brand;
    }

    public String getType(){
        return type;
    }

    public int getPrice(){
        return price;
    }
}
