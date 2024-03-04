// 

// import java.util.Scanner;
import java.util.*;

class ATM{
    float Balance;
    int PIN=5674;
    // Scanner sc=new Scanner(System.in);

    public void checkpin(){
        System.out.println("Enter Your Pin");
        Scanner sc=new Scanner(System.in);
        int enetredpin=sc.nextInt();
        if(enetredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter the valid Pin");
            
        }

    }
    public void menu(){
        System.out.println("Enter Your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money ");
        System.out.println("Exit");
    
    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();

    if(opt==1){
        checkBalance();
    }
    else if(opt==2){
        withdrawMoney();
    }
    else if(opt==3){
        depositMoney();
    }
    else if(opt==4){
         return;
    }
    else{
        System.out.println("Enter a valid choice");
    }
}




     public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float Amount=sc.nextFloat();
        if(Amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance-=Balance;
            System.out.println("Money Withdrawn Successfully");
            
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter Amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance+=amount;
        System.out.println("Money Deposite Successfully");
        menu();

    }

}
public class Atmmachinee{
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();
        
    }
}