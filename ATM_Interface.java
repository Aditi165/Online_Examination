import java.util.*;
class BankAccount{
    String name;
    String username;
    String password;
    String accountNo;
    float balance=100000f;
    String  transcationHistory="";
    int transactions=0;
    public void register90{
        Scanner sc= new Scanner(System.in);
        System.out.print("\n Enter Your Name - ");
        this.name =sc.nextLine();
        System.out.print("\n Enter Your Username - ");
        this.username = sc.nextline();
        System.out.print("\n Enter Your Password - ");
        this.password = sc.nextLine();
        System.out.print("\n Enter Your Account Number");
        this.accountNo = sc.nextLine();
        System.out.println("\n Registration completed..kindly login");
    }  
    

}