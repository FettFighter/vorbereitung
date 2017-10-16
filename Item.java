public class Item<T> {
  private Item<T> left, right;
  private T value;
 
  public Item(T value) {
    this.value = value;
  }
 
  public Item<T> left() {
    return left;
  }
 
  public void left(Item<T> left) {
    this.left = left;
  }
 
  public Item<T> right() {
    return right;
  }
 
  public void right(Item<T> right) {
    this.right = right;
  }
 
  public T value() {
    return value;
  }
 
  public void value(T value) {
    this.value = value;
  }
 
  public String toString() {
    return "(" + value + ")";
  }
}