package Movie;

public class Movie {
  private String genre;
  private int length;
  private String director;

  public Movie(String genre, int length, String director) {
    this.genre = genre;
    this.length = length;
    this.director = director;
  }

  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }
}
