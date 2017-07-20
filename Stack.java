public class Stack<S> {

  private EVL<S> store = new EVL<S>();

  public Stack() {
  }
  //push -> Push legt den neunen Wert oben drauf.
  //bekomme ein wer der nicht von EVL ist und werfe in stack.
  public void push(S valueIn) {
    store.prependValue(valueIn);
  }
  
  //pop ->  Pop nimmt den OBERSTEN Wert weg und liefert ihn.
  public S pop() {
    S tempValue = peek();
    store.deleteFirst();   
    return tempValue;
  }

  //peek -> Peek guckt was ist der oberste Wert.
  public S peek() {
    return store.firstValue();
  }

  public String toString() {
    return store.toString();
  }
}
