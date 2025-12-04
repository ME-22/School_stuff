package washingMachine;

public class washingMachine {
  private int id;
  private String model;
  private String brand;
  private String washingProgram;

  public washingMachine(int id, String model, String brand, String washingProgram) {
    this.id = id;
    this.model = model;
    this.brand = brand;
    this.washingProgram = washingProgram;
  }

  public int getId() {
    return id;
  }

  public String getModel() {
    return model;
  }

  public String getBrand() {
    return brand;
  }

  public String getWashingProgram() {
    return washingProgram;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setWashingProgram(String washingProgram) {
    this.washingProgram = washingProgram;
  }
}
