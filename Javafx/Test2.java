import java.util.Scanner;
  
  public class Test2 {
    public static void main( String[] args ) {
      Scanner sc = new Scanner( System.in );
      
      System.out.println( "input name: " );
      String name = sc.nextLine();
      System.out.println( "ALOHA! " + name + "!" );
    }
  }