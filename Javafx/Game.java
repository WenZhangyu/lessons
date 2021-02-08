import java.util.Random;
   import java.util.Scanner;
   
   public class Game {
     public static void main ( String[] args ) {

       int n=0;
       Random random = new Random();
       Scanner sc = new Scanner( System.in );
       int target = random.nextInt( 10 );
       while(true){
       

       System.out.print( "your answer? >" );
       int answer = sc.nextInt();
       
       if ( answer == target ) {
         System.out.println( "you win!" );
         System.out.println("\n\nTry : "+n+"x");
         break;
       } else {
        System.out.println("nope!");
        //System.out.println( "target: " + target );
        System.out.println();
       }
       n++;
     }
   }
}