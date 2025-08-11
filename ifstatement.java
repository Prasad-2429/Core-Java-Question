import java.util.Scanner;
public class ifstatement{
    public static void main (String args[]){
        int age;
        System.out.print("Enter Your age : ");
        Scanner r = new Scanner (System.in);
        age =r.nextInt();
        if(age>=18){
            System.out.print("Eligible for votes , ");
        }
        System.out.print("Thank you !");
    }
}
