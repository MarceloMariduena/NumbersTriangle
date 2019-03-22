
import java.util.*;
public class NumbersTriangleMarceloMariduena {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    int n;
    
    System.out.print("Enter n: ");
    n = input.nextInt();
    
    showTriangle(n, n);
    input.close();
  }
  
  public static void showTriangle(int n) {
    showTriangle(n, n);
  }
  
  public static void showTriangle(int n, int k) {
    int i;
    
    //base case
    if(k < 0)
      return;
    
	//write your code below this line
    /* @author: Marcelo Mariduena */
    i = k;
    /* Initial spacing for numbers: increases as k decreases with each recursion */
    for (int numSpacing = 0; numSpacing < n - k; numSpacing++) {
    	System.out.print("  ");
    }
    /* Going up */
    for (int x = k; x > 0; x--) {
    	System.out.print((n - i) + " ");  
    	i--; // subtract less from "n" each iteration
    }
    /* Coming down */
    for (int x = 0; x <= k; x++) {
    	System.out.print((n - i) + " ");
    	i++; // subtract more from "n" each iteration
    }
    System.out.println(); // split
    /* Initial spacing for dashes: increases when k decreases with each recursion */
    for (int x = 0; x < n - k; x++) {
    	System.out.print("  ");
    }
    /* Dashes: increases when k decreases with each recursion */
    for (int x = 0; x <= k * 2; x++) {
    	System.out.print("- ");
    }
    k--;
    System.out.println();
    showTriangle(n, k);

  } 
  
}
