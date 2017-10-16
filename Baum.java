public class Baum<T extends Comparable<T>> {
  Item<T> root;

  public void add(T value) {
    if(root == null) {
      root = new Item<>(value);
    } else {
      Item<T> stepItem = root;
      Item<T> oldStepItem = root;
      int comp;
      
      while(stepItem != null) {
        oldStepItem = stepItem;
        comp = stepItem.value().compareTo(value);
        
        if(comp < 0) {
          stepItem = stepItem.left();
        } else if(comp > 0) {
          stepItem = stepItem.right();
        } else {
          return;
        }
      }
      
      comp = oldStepItem.value().compareTo(value);
      if(comp < 0) {
        oldStepItem.left(new Item<T>(value));
      } else if(comp > 0) {
        oldStepItem.right(new Item<T>(value));
      }
    }
  }

  private String toString(Item<T> item) {
    return item == null 
      ? "" 
      : "[" + toString(item.left()) + "<" + item + ">" + toString(item.right()) + "]";
  }

  public String toString() {
    return toString(root); 
  }
  
  public T root() {
    return root.value();
  }
}