import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord {
  public static void main(String[] args) {
      String champion = "";
      int index = 0;
    while(!StdIn.isEmpty()) {
        String input = StdIn.readString();
        boolean accept = StdRandom.bernoulli(1 / (index + 1.0));
        if(accept) {
            champion = input;
        }
        index ++;
    }
      System.out.println(champion);
  }
}
