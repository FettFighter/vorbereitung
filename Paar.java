public class Paar<E,Z>  {

  private E erstes;
  private Z zweites;
  //komstrukror
  public Paar(E erstes, Z zweites) {
    this.erstes = erstes;
    this.zweites = zweites;
//    compareWrite(erstes, zweites);
  }
  //setter
  public void erstes(E erstes) {
    this.erstes = erstes;
  }
  //getter
  public E erstes() {
    return erstes;
  }
  //setter
  public void zweites(Z zweites) {
    this.zweites = zweites;
  }
  //getter
  public Z zweites() {
    return zweites;
  }
  //getter
  public String toString() {
    return "("+ erstes + "," +  zweites + ")";
  }
/*  //setter
  public String replaceGivenValuesInOrder(E erstes, Z zweites) {
    String temp = toString();
    compareWrite(erstes, zweites);
    return temp;
  }
  //setter
  private void compareWrite(E erstes, Z zweites) { 
    if(erstes.doubleValue() < zweites.doubleValue()) {
      this.erstes = erstes;
      this.zweites = zweites;
    } else {
      this.erstes = zweites;
      this.zweites = erstes; 
    }
  }
*/
}
