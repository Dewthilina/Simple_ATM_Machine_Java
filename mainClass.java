import java.util.Scanner;

public class mainClass {
     public static void main(String[] args){
         
          System.out.println("Welcome To ATM Machine");

          atmOperationInterface op= new atmOperationImplement();

          int atmNum=12345;
          int atmPin=1212;
          Scanner sc=new Scanner(System.in);

          System.out.print("Enter ATM Number: ");
          int atmNumber=sc.nextInt();
          //System.out.print("\n");

          System.out.print("Enter Pin: ");
          int pin=sc.nextInt();
          System.out.print("\n");

          if((atmNum==atmNumber)&&(atmPin==pin)){
               System.out.println("Successfully Validated");

               while (true) {
                    System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit\n");
                    System.out.println("Enter Choice: ");
                    int ch=sc.nextInt();

                    if(ch ==1){
                         op.viewBalanace();
                    }
                    else if(ch==2){
                         System.out.println("Enter Amout To Withdraw");
                         double withdrawAmount=sc.nextDouble();
                         op.withdrawAmount(withdrawAmount);
                    }
                    else if(ch==3){
                         System.out.println("Enter Amount To Deposit :  ");
                         double depositAmount=sc.nextDouble();
                         op.depositAmount(depositAmount);
                    }
                    else if(ch==4){
                         op.viewMiniStatement();
                    }
                    else if(ch==5){
                         System.out.println("Collect Your ATM Card\nThank you For The Using ATM Machine");
                         System.exit(0);
                    }
                    else{
                         System.out.println("Please Enter Correct Choice");
                    }

               }
          }
          else{
               System.out.println("Incorrect Pin or ATM Number");
               System.exit(0); 
          }
     }
}
