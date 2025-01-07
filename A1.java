import java.util.*;
interface Principal {
    void principal();
}
interface interestRate {
 void annualRate();
}
class Loan implements Principal,interestRate {
    float total;
    int principal;
    float rate;
    float year;
Loan(int p,float r, float year) {
    this.principal=p;
    this.rate=r;
    this.year=year;
}
   public void principal(){
       System.out.println("\n----------------------");
        System.out.println("Principle amount : "+principal);
        System.out.println("rate : "+rate);
        System.out.println("year : "+year);
       System.out.println("\n---------------------");
        
    }
   public void annualRate() {
        total = principal*rate*year;
        System.out.println("Total interest paid : "+total);
        total = total/12;
       System.out.println("Annual year rate of interest : "+total);
    } 
}
class Main {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter base amount : ");
 int p = sc.nextInt();
System.out.println("Enter interest of rate : ");
 float r = sc.nextFloat();
System.out.println("Enter year : ");
 float year = sc.nextFloat();

Loan ln= new Loan(p,r,year);
ln.principal();
ln.annualRate();

}
}
