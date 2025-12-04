package Battery;

public class Battery {
  private int charge;
  private String model;
  private float waight;
  private int widht;
  private int height;
  private int thickness;

  public Battery(int charge, String model, float waight, int widht, int height, int thickness) {
    this.charge = charge;
    this.model = model;
    this.waight = waight;
    this.widht = widht;
    this.height = height;
    this.thickness = thickness;
  }

  public int getCharge() {
    return charge;
  }
  public String getModel() {
    return model;
  }
  public float getWaight() {
    return waight;
  }
  public int getWidth() {
    return widht;
  }
  public int getHeight() {
    return height;
  }
  public int getThickness() {
    return thickness;
  }

  public void setCharge(int charge) {
    this.charge = charge;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public void setWaight(float waight) {
    this.waight = waight;
  }
  public void setWidth
  
  
  (int widht) {
    this.widht = widht;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  public void setThickness(int thickness) {
    this.thickness = thickness;
  }
}
