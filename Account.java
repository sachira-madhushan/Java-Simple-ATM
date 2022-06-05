public class Account {
    
    //variables
    private String name,address,id,branch;
    private int accountNumber;
    private float balance;
    //endvariables

    //constuctor
    Account(String name,String address,String id,int accountNumber,String branch,float balance){
        this.name=name;
        this.address=address;
        this.id=id;
        this.accountNumber=accountNumber;
        this.branch=branch;
        this.balance=balance;  
    }

    public void CheckAccountBalance(){
        System.out.println("Account Number  :"+accountNumber);
        System.out.println("Account Holder  :"+name);
        System.out.println("Account Balance :"+balance);
    }
    public void Withdraw(float amount){
        if(amount>balance){
            System.out.println("[!]Insufficiant Balance.");
        }
        else{
            balance-=amount;
            System.out.println("[+]Rs."+amount+" withdrawed.");
            System.out.println("[+]Balance Updated.");    
        }
    }
    
    public void Deposit(float amount){
        balance+=amount;
        System.out.println("[+]Balance Updated.");    
    }
    
    public void PrintDetails(){
        System.out.println("[-]Account Number   :"+accountNumber);    
        System.out.println("[-]Account Holder   :"+name);    
        System.out.println("[-]Holder's Id      :"+id);    
        System.out.println("[-]Holder's Address :"+address);    
        System.out.println("[-]Branch           :"+branch);    
        System.out.println("[-]Account Balance  :"+balance);    
    }


}
