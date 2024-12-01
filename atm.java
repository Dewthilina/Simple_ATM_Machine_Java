public class atm{

     private double balance;
     private double depositAmount;
     private double withdrawAmount;

     //constructor
     public atm(){

     }

     //setter
     public void setBalance(double balance){
          this.balance=balance;
     }

     public void setDepositAmount(double depositAmount){
          this.depositAmount=depositAmount;
     }

     public void setWithdrawAmount(double withdrawAmount){
          this.withdrawAmount=withdrawAmount;
     }

     // Getter
     public double getBalance(){
          return balance;
     }

     public double getDepositAmount(){
          return depositAmount;
     }

     public double getWithrawAmount(){
          return withdrawAmount;
     }

}