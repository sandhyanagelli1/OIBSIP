import java.util.*;
public class ATM {
    public static void main (String args[]) {
        int bal = 30000;
        int ch,amt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");
        System.out.println("Enter your choice : ");
        ch = sc.nextInt();
        switch(ch) {
            case 1:
            System.out.println("Your balance is RS" +bal);
            break;
            case 2:
            System.out.println("Enter amount to withdraw : ");
            amt = sc.nextInt();
            if(bal>=amt)
            {
                bal-=amt;
                System.out.println("Your new balance is  "+bal);               
            }
            else{
                System.out.println("Insufficient funds !");
            }
            break;
            case 3:
            System.out.println("Enter amount to deposit :");
            amt = sc.nextInt();
            bal +=amt;
            System.out.println("Your new balance is RS "  + bal);
            break;
            case 4:
            System.out.println("Thank for using the ATM ");
            break;
            default :
            System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }

    }
