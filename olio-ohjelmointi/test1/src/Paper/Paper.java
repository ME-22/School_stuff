package Paper;
public class Paper {
  private String size;
  private int waight;
  private String content;

  public Paper(String string, int i, String string2) {
    this.size = string;
    this.waight = i;
    this.content = string2;
  }
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }
  public int getWaight() {
    return waight;
  }
  public void setWaight(int waight) {
    this.waight = waight;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
}
