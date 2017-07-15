public class Starter {
  public static void main (String args[]) {

    Paar<Integer, Integer> paar = new Paar<Integer, Integer>(128,64);
    Paar<String, Paar<Integer, Integer>> paar2 = new Paar<String, Paar<Integer, Integer>>(new String("Lawl"), paar);
    Paar<Paar<Integer, Integer>, Paar<Integer, Integer>> paar3 = new Paar<Paar<Integer, Integer>, Paar<Integer, Integer>>(paar, paar);
    /*Ein Paar und ein String des Paar */
    Paar<Paar<Integer, Integer>, String> paar4 = new Paar<Paar<Integer, Integer>, String>(paar,paar.toString());


    System.out.println(paar.toString());
    //System.out.println(paar.replaceGivenValuesInOrder(32,16));
    System.out.println(paar4.toString());
    System.out.println(paar4.erstes.getClass().toString()+ paar4.zweites.getClass().toString());
  }
}
