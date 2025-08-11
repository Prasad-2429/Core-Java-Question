public class Logical {
    public static void main (String args[]){
        System.out.println("Logical AND");
        System.out.println((10>5) && ( 2>1));//TRUE
        System.out.println((10>5) && ( 2<1));//FALSE
        System.out.println((10<5) && ( 2<1));//FALSE
        
        System.out.println("Logical OR");
        System.out.println((10>5) || ( 2>1));//TRUE
        System.out.println((10>5) || ( 2<1));//TRUE
        System.out.println((10<5) || ( 2<1));//FALSE
        
    }
}
