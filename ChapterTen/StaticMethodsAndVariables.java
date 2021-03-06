// Regular method
public class Song {
  String title;
  public Song(String t) {
    title = t;
  }
  public void play() {
    SoundPlayer = new SoundPlayer();
    player.playSound(Title);
  }
}

// Static method
public static int min(int a, int b) {
  // returns the lesser of a and b
}
// min() comes from the Math class which does not require an instance variable

// Static variable
public class Duck {
  private int size;
  // The static duckCount variable is initialized ONLY when the class is first lodaded, NOT each time a new instance is made
  private static int duckCount = 0;

  public Duck() {
    duckCount++;
  }

  public void setSize(int s) {
    size = s;
  }
  public int getSize() {
    return size;
  }
}

// Initialize a static final variable:
// At the time you declare it
public class Foo {
  public static final int FOO_X = 25;
}
// Static Initializer
class Foo {
  final static int X;
  // This code runs as soon as the class is loaded, before any static method is called
  static {
    X = 42;
  }
}
