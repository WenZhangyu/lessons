public class MethodTest2 {
     public static void main ( String[] args ) {
       hello( "Tanaka" );
       hello( "Yamamoto" );
       hello( "Watanabe" );
       hello( "wen")
     }
     
     // ↓　ここに、新しい method をつくります
     public static void hello ( String name ) {
       System.out.println( "Hello! " + name + "!" );
     }
   }