public class MethodTest2 {
     public static void main ( String[] args ) {
       hello( "Tanaka" );
       hello( "Yamamoto" );
       hello( "Yoshino" );
     }
     public static void hello( String name ) {
       if ( name.equals( "Yoshino" ) ) {
         System.out.println( "ALOHA! " + name + "!" );
       } else {
         System.out.println( "Hello! " + name + "!" );
       } 
     }
   }