import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class spiral {
  public static void main (String args[]) throws IOException {
    InputStreamReader isr =  new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter the number ....");
    int n = Integer.parseInt(br.readLine());
    int cycle = 0;
    Integer a[][] = new Integer[n][n];
    int numberOfCycles = n / 2;
    int i;
    int number = 0;
    int j;
    while (cycle < numberOfCycles) {
      i = cycle;
      for (j = cycle; j < n; j++) {
        if (a[i][j] == null) {
          number = number + 1;
          a[i][j] = number;
        }
      }
      System.out.println("Ending first iteration ....");
      j = n - 1 - cycle;
      for (i = cycle; i < n; i++) {
        if (a[i][j] == null) {
          number = number + 1;
          a[i][j] = number;
        }
      }
      System.out.println("Ending second iteration ....");
      i = n - 1 - cycle;
      for (j = i; j >= 0; j--) {
        if (a[i][j] == null) {
          number = number + 1;
          a[i][j] = number;
        }
      }
      System.out.println("Ending third iteration ....");
      j = cycle;
      for (i = n - 1 - cycle; i >= 0; i--) {
        if (a[i][j] == null) {
          number = number + 1;
          a[i][j] = number;
        }
      }
      System.out.println("Ending fourth iteration ....");
      cycle = cycle + 1;
    }
    System.out.println("yay");
    if (n % 2 == 1) {
      a[n/2][n/2] = ++number;
    }

  // printing logic.
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
          if (a[i][j] != null) {
            System.out.print(a[i][j] + " ");
          }
          else {
            System.out.print(0 + " ");
          }
      }
      System.out.println();
    }
  }
}
