import java.util.Scanner; // Make the Scanner class available.
public class TestInput {
 public static void main(String[] args) {
 Scanner stdin = new Scanner( System.in ); // Create the Scanner.

 System.out.print("Enter an integer : ");
 int i = stdin.nextInt();
 System.out.print("Enter an integer : ");
 int j = stdin.nextInt();
 System.out.println(i + " + " + j + " = " + (i + j));
 System.out.println(i + " - " + j + " = " + (i - j));
 System.out.println(i + " * " + j + " = " + (i * j));
 // integer division by zero gives an error...
 System.out.println(i + " / " + j + " = " + (i / j));
 System.out.println(i + " % " + j + " = " + (i % j));
 System.out.println(i + " & " + j + " = " + (i & j));
 System.out.println(i + " | " + j + " = " + (i | j));
 System.out.println(i + " ^ " + j + " = " + (i ^ j));
 System.out.println(i + " << " + j + " = " + (i << j));
 System.out.println(i + " >> " + j + " = " + (i >> j));
 System.out.print("Enter a double : ");
 double d = stdin.nextDouble();
 System.out.print("Enter a double : ");
 double e = stdin.nextDouble();
 System.out.println(d + " + " + e + " = " + (d + e));
 System.out.println(d + " - " + e + " = " + (d - e));
 System.out.println(d + " * " + e + " = " + (d * e));
 // the division of a double by zero gives Nan or +/- Infinity...
 System.out.println(d + " / " + e + " = " + (d / e));
 stdin.close();
 }
}