import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    int value;
    // Input the integer
    System.out.println("Enter the integer: ");
    // Create Scanner object
    Scanner s = new Scanner(System.in);
    // Read the next integer from the screen
    value = s.nextInt();

    int i=1;
    while(i<=value) {
        System.out.print((2*i-1)+",");
        i++;
    }
  }
}