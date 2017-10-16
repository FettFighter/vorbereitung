import java.util.Iterator;

public class DVL<T> implements Iterable<T> {
  private Item<T> start;

  public int length() {
    Item<T> stepItem = start;
    int i;
    for(i = 0; stepItem != null; ++i) {
      stepItem = stepItem.right();
    }
    return i;
  }

  public String toString() {
    String string = "";
    Item<T> stepItem = start;
    while(stepItem != null) {
      string += stepItem;
      stepItem = stepItem.right();
    }
    return string;
  }

  public void prepend(T value) {
    Item<T> tempItem = new Item<>(value);

    if(start == null) {
      start = tempItem;
    } else {
      start.left(tempItem);
      tempItem.right(start);
      start = tempItem;
    }
  }

  public void insert(T value, int idx) throws Exception {
    Item<T> tempItem = new Item<>(value);

    if(start == null) {
      start = tempItem;
    } else if(length() < idx) {
      throw new Exception("DVL nicht lang genug");
    } else {
      Item<T> stepItem = start;
      for(int i = 0; i < idx; i++) {
        stepItem = stepItem.right();
      }
      stepItem.right().left(tempItem);
      tempItem.right(stepItem.right());
      stepItem.right(tempItem);
      tempItem.left(stepItem);
    }
  }

  public void append(T value) {
    Item<T> tempItem = new Item<>(value);

    if(start == null) {
      start = tempItem;
    } else {
      Item<T> stepItem = start;
      for(int i = 0; stepItem.right() != null; i++) {
        stepItem = stepItem.right();
      }
      tempItem.left(stepItem);
      stepItem.right(tempItem);
    }
  }

  public T get(int idx) throws Exception {
    Item<T> stepItem = start;
    if(start == null) {
      throw new Exception("DVL ist leer");
    } else if(length() < idx) {
      throw new Exception("DVL nicht lang genug");
    } else {
      for(int i = 0; i < idx; ++i) {
        stepItem = stepItem.right();
      }
    }

    return stepItem.value();
  }

  public Iterator<T> iterator() {
    final DVL<T> dvl = this;
    return new Iterator<T>() {
      int idx = 0;
      public boolean hasNext() {
        return idx < dvl.length();
      }

      public T next() {
        try {
          return dvl.get(idx++);
        } catch(Exception e) {
          e.printStackTrace();
          return null;
        }
      }
    };
  }
}