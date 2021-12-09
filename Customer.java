
public class Customer
{
    private String custName;
    private String gender;
    private char member;
    private String phoneNo;
    private double total ;
    
    
    public Customer (){}
    
    public Customer (String n, String g, char m, String pn,double t)
    {
        this.custName = n;
        this.gender = g;
        this.member = m;
        this.phoneNo = pn;
        this.total = t;
        
    }
    
    public void setCustName (String custName) {this.custName = custName;}
    public void setGender (String gender) {this.gender = gender;}
    public void setMember (char member) {this.member = member;}
    public void setPhoneNo (String phoneNo) {this.phoneNo = phoneNo;}
    public void setTotal (double total) {this.total = total;}
    
    
    public String getCustName () {return this.custName;}
    public String getGender () {return this.gender;}
    public char getMember () {return this.member;}
    public String getPhoneNo () {return this.phoneNo;}
    public double getTotal () {return this.total;}
    
    
    public String toString () {
        return "CUSTOMER DETAILS" + "\n" +
               "Customer name : " + this.custName + "\n" +
               "Gender : " + this.gender + "\n" +
               "Phone Number: " + this.phoneNo +
               "\nTotal Price:RM " + this.total ;
    } 
}
