public class Queue<Q> {

  private EVL<Q> snake = new EVL<Q>();
  
  public Queue() {
  }
  
  //Speichert einene Wert in die Schlange.
  public void queue(Q snakeIn) {
    snake.prependValue(snakeIn);
  }
  
  //Nimmt einen Wert aus der Schlange raus.
  public Q dequeue() {
    Q tempValue = peek();
    snake.deleteLast();
    return tempValue;
  }
  
  //Damit schaut man sich den Wert an.
  public Q peek() {
    return snake.letzterWert();
  }
  
  public String toString() {
    return snake.toString();
  }
}