package data;

public class rock {
  int id;
  String name;
  float weight;

  public rock(int id, String name, float weight) {
    this.id = id;
    this.name = name;
    this.weight = weight;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getWeight() {
    return weight;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }
}
