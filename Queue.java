public class Queue<Q> {

  private EVL<Q> snake = new EVL<Q>();
  public Queue() {
  }
  //1. Name: queue() | Speichert einene Wert in die queue.
  public void queue(Q snakeIn) {
    snake.prependValue(snakeIn);
  }
  //2. Name: dequeue() | Nimmt einen Wert aus der Queue raus.
  public Q dequeue() {
    Q tempValue = peek();
    snake.deleteLast();
    return tempValue;
  }
  //3. Name: peek() | Damit guck ich mit den Wert an.
  public Q peek() {
    return snake.letzterWert();
  }
  //4. Name toString() | toString Methode.
  public String toString() {
    return snake.toString();
  }
}
