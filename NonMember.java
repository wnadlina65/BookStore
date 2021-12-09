
public class NonMember extends Customer
{
    String invite;
    
    public NonMember (){}
    public NonMember (String n, String b, String g, char m, String pn,double t, String i)
    {
        super(n,g,m,pn,t);
        this.invite = i;
        
    }
    
    public void setInvite(String invite){this.invite = invite;}
    public String getInvite(){return this.invite;}
    
    public String Note(){
        return "\nHi! do you want to get a discount on every purchase? Come and be our member now ^_^\n";
    }
}
