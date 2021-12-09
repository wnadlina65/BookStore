
public class Member extends Customer
{
    private int yearIn;
    
    public Member(){}
    
    public Member (String n, String b, String g, char m, String pn,double t,int y){
        super(n,g,m,pn,t);
        this.yearIn = y;
    }
    
    public int getYearIn () {return this.yearIn;}
    
    public String Note(){
        return ("\nThank you for being one of our member.. Please enjoy any purchase with discount of 10% *_* \n ");
    }
        
    public double calculateDisc(double total){
        total = 0.10 * total;
        return total;
    }
}
    

