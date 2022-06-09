/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhom8_project.entity;


import java.io.Serializable;
import java.util.Objects;
import nhom8_project.utils.DateFormat;
import nhom8_project.view.loginView;

/**
 *
 * @author DELL
 */
public class LichSu implements Serializable {
    private String  Id,Name,Time,Active,Describe,Type;
    private boolean Status=true;
    
    
public boolean getStatus() {
        return Status;
    }

public void setStatus(boolean status) {
        this.Status = status;
    }    

public String getId() {
        return Id;
    }
    
 public void setId(String id){
        this.Id=id;
    }
 
public String getName() {
        return Name;
    }
    
 public void setName(String name){
        this.Name=name;
    }

 public String getTime() {
        return Time;
    }
    
 public void setTime(String time){
        this.Time=time;
    }

 public String getActive() {
        return Active;
    }
    
 public void setActive(String active){
        this.Active=active;
    }
 
 public String getDescribe() {
        return Describe;
    }
    
 public void setDescribe(String describe){
        this.Describe=describe;
    }
 
 public String getType() {
        return Type;
    }
    
 public void setType(String type){
        this.Type=type;
    }
 
 public LichSu(){       
    }
 
 public LichSu(String time,String type,String id,String name,String active,boolean status,String describe){
           
         this.Time = time;                 
         this.Type = type; 
         this.Id = id;                 
         this.Name = name;
         this.Active = active;
         this.Status= status;
         this.Describe=describe;
}
 
 
 
 @Override
    public String toString() {
            return Time+";"+Type+";"+Id+";"+Name+";"+Active+";"+Status+";"+Describe;
    } 
    
  @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LichSu other = (LichSu) obj;
        return Objects.equals(this.Type, other.Type);
    }   
}