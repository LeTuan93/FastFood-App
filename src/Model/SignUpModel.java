package Model;


import java.io.Serializable;

public class SignUpModel implements Serializable{
    private int idTrace;
    private String fullName;
    private String email;
    private String passWord;
    private String status="offline";
    private String gender="";
    private String birthDay="";
    private String job="";

    private String likeShop="";
    private String historyOfBill="";
    private static final long serialVersionUID = 6455730122562065533L;
    public SignUpModel(int idTrace,String fullName, String email, String passWord,String status,String gender , String birthDay,String job,String likeShop,String historyOfBill) {
        this.idTrace= idTrace;
        this.fullName = fullName;
        this.email = email;
        this.passWord = passWord;
        this.status = status;
        this.gender = gender;
        this.birthDay=birthDay;
        this.job = job;
        this.likeShop=likeShop;
        this.historyOfBill = historyOfBill;
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
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public String getLikeShop() {
        return likeShop;
    }

    public void setLikeShop(String likeShop) {
        this.likeShop = likeShop;
    }
    public String getHistoryOfBill() {
        return historyOfBill;
    }

    public void setHistoryOfBill(String historyOfBill) {
        this.historyOfBill = historyOfBill;
    }
    @Override
    public String toString() {
        return "SignUpModel{" + "idTrace=" + idTrace + ", fullName=" + fullName + ", email=" + email + ", passWord=" + passWord + ", status=" + status + ", gender=" + gender + ", birthDay=" + birthDay + ", job=" + job + ", likeShop=" + likeShop + ", historyOfBill=" + historyOfBill + '}';
    }

}
