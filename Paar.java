public class Paar<E,Z>  {

  private E erstes;
  private Z zweites;
  
  public Paar(E erstes, Z zweites) {
    this.erstes = erstes;
    this.zweites = zweites;
  }
  
  public void erstes(E erstes) {
    this.erstes = erstes;
  }
  
  public E erstes() {
    return erstes;
  }
  
  public void zweites(Z zweites) {
    this.zweites = zweites;
  }
  
  public Z zweites() {
    return zweites;
  }
  
  public String toString() {
    return "("+ erstes + "," +  zweites + ")";
  }
}