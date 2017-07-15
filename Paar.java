public class Paar {

  int erstes;
  int zweites;
  //komstrukror
  public Paar(int erstes, int zweites) {
    compareWrite(erstes, zweites);
  }
  //setter
  public void erstes(int erstes) {
    this.erstes = erstes;
  }
  //getter
  public int erstes() {
    return erstes;
  }
  //setter
  public void zweites(int zweites) {
    this.zweites = zweites;
  }
  //getter
  public int zweites() {
    return zweites;
  }
  //getter
  public String toString() {
    return "("+ erstes + "," +  zweites + ")";
  }
  //setter
  public String replaceGivenValuesInOrder(int erstes, int zweites) {
    String temp = toString();
    compareWrite(erstes, zweites);
    return temp;
  }
  //setter
  private void compareWrite(int erstes, int zweites) { 
    if(erstes < zweites) {
      this.erstes = erstes;
      this.zweites = zweites;
    } else {
      this.erstes = zweites;
      this.zweites = erstes; 
    }
  }
}
