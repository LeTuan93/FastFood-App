package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SignUpModel implements Serializable{


    private int idTrace;
    private String fullName;
    private String email;
    private String passWord;
    
    public SignUpModel(int idTrace,String fullName, String email, String passWord) {
        this.idTrace= idTrace;
        this.fullName = fullName;
        this.email = email;
        this.passWord = passWord;
    }
    
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public int getIdTrace() {
        return this.idTrace;
    }

    public void setIdTrace(int idTrace) {
        this.idTrace = idTrace;
    }
    
        @Override
    public String toString() {
        return "SignUpModel{" + "idTrace=" + idTrace + ", fullName=" + fullName + ", email=" + email + ", passWord=" + passWord + '}';
    }
}
