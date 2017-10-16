public class Stack<S> {

  private EVL<S> store = new EVL<S>();

  public Stack() {
  }
  
  public void push(S valueIn) {
    store.prependValue(valueIn);
  }
  
  public S pop() {
    S tempValue = peek();
    store.deleteFirst();   
    return tempValue;
  }
  
  public S peek() {
    return store.firstValue();
  }

  public String toString() {
    return store.toString();
  }
}