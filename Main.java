import java.util.HashSet;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        
        Decorations dc=new Decorations();
        Clear clear=new Clear();
        Scanner input=new Scanner(System.in);
        Account account =new Account("Sacheera Madhushan", "No 585/1 medagampura medirigiriya", "123456789", 123456789, "Medirigiriya", 12000);
        
        program:
        while(true){
            clear.cleanScreen();
            dc.MainDecoration();
            System.out.print("[?]Enter Your Bank Account Number :");
            int accountNumber=input.nextInt();
            System.out.print("[?]Enter Your Pin Code             :");
            int pinCode=input.nextInt();
            if(accountNumber==123456789 && pinCode==1234){
                clear.cleanScreen();
                dc.MainDecoration();
                System.out.println("\t[1]Check Balance");
                System.out.println("\t[2]Account Details");
                System.out.println("\t[3]Withdraw");
                System.out.println("\t[4]Deposit");
                System.out.println("\t[5]Exit");
                System.out.print("[?]Enter Your Option :");
                try{
                    int option=input.nextInt();
                    switch(option){
                        case 1:
                            clear.cleanScreen();
                            dc.BalanceDecoration();
                            account.CheckAccountBalance();
                            clear.pause();
                            continue;
                        case 2:
                            clear.cleanScreen();
                            dc.AccountDetails();
                            account.PrintDetails();
                            clear.pause();
                            continue;
                        case 3:
                            clear.cleanScreen();
                            dc.WithdrawDecoraion();
                            System.out.print("[?]Enter Amount To Withdraw:");
                            Float amount=input.nextFloat();
                            account.Withdraw(amount);
                            clear.pause();
                            continue;
                        case 4:
                            clear.cleanScreen();
                            dc.DepositDecoration();
                            System.out.print("[?]Enter Amount To Deposit:");
                            Float amount2=input.nextFloat();
                            account.Deposit(amount2);
                            clear.pause();
                            continue;
                        case 5:
                            break program;
                    }
                }
                catch(Exception e){
                    continue;
                }
            }
            else{
                System.out.println("[!]Invalied Bank Details.");
                clear.pause();
                continue;
            }
            
        }
    }
}