import java.util.Scanner; //change1
class program22      
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in); //change2
        
        System.out.println("Enter your Name :");
        String sName = scanner.nextLine();

        System.out.println("Welcome "+sName); //chane3
        
    }
}