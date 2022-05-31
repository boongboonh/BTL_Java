
package nhom8_project.entity;


public class Account {
    public int accountID;       //PK
    public String accountName;
    public String accountPass;
    public int role;

    public int getAccountID() {
        return accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public int getRole() {
        return role;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
    }

    public void setRole(int role) {
        this.role = role;
    }

   

   
    public Account(){
        
    }

    public Account(int accountID, String accountName, String accountPass, int role) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountPass = accountPass;
        this.role = role;
    }
    
   
    
}
