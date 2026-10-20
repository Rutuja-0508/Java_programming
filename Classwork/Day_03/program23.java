import java.util.Scanner; 
class program23      
{
    public static void main(String A[])
    {
        Scanner scanner = null;  //change1
        String sName = null;    //change2

        scanner = new Scanner(System.in); 
        
        System.out.println("Enter your Name :");
        sName = scanner.nextLine();

        System.out.println("Welcome "+sName); 
        
    }
}