package Model;

public class SignUpModel {
    private String fullName;
    private String email;
    private String passWord;
    
    public SignUpModel(String fullName, String email, String passWord) {
        this.fullName = fullName;
        this.email = email;
        this.passWord = passWord;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
