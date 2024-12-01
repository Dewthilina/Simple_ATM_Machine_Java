import java.util.HashMap;
import java.util.Map;

public class atmOperationImplement implements atmOperationInterface {

     atm am =new atm();
     Map<Double,String> miniStmt=new HashMap<>();

     @Override
     public void viewBalanace() {
          System.out.println("Available Balance is : "+am.getBalance());
          System.out.println();
     }

     @Override
     public void withdrawAmount(double withdrawAmount) {
          if(withdrawAmount%100==0){
               if(withdrawAmount<=am.getBalance()){
                    miniStmt.put(withdrawAmount," Amount Withdrawn");
                    System.out.println("Collect The Cash "+withdrawAmount);
                    am.setBalance(am.getBalance()-withdrawAmount);
                    viewBalanace(); 
                    System.out.println();
              }
              else{
                    System.out.println("Insufficient Balance");
                    System.out.println();
              }
          }
          else{
               System.out.println("Please Enter The Amount In Multiple Of 100");
               System.out.println();
          }
         
     }

     @Override
     public void depositAmount(double depositAmount) {
          miniStmt.put(depositAmount," Amount Deposited");
         System.out.println(depositAmount+" Deposited Successfully...");
         am.setBalance(am.getBalance()+depositAmount);
         viewBalanace();
         System.out.println();
     }

     @Override
     public void viewMiniStatement() {
          for(Map.Entry<Double,String> m:miniStmt.entrySet()){
               System.out.println(m.getKey()+""+m.getValue());
          }
          System.out.println();
     }
     
}
