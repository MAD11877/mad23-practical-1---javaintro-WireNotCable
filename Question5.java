import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    int tries = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();
    for (int i = 0; i < tries; i++) {
      int num = in.nextInt();
      data.add(num);
    }
    int maxnum = 0;
    int maxcount = 0;
    for (int x = 0; x < data.size(); x++) {
      int count = 0;
      for (int w = 0; w < data.size(); w++) {
        if (data.get(w) == data.get(x)) {
          count++;
        }
      }
      if (count > maxcount) {
        maxcount = count;
        maxnum = data.get(x);
      }
    }
    System.out.println(maxnum);
    in.close();

  }
}
