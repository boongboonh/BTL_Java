/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity;

/**
 *
 * @author Admin
 */
public class User {
    private String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        
    }
    public User(){
        
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return userName+";"+password; 

    }
    
    
    
}
