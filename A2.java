import java.util.*;
interface Numberinput {
    void numberr();
}
interface Automorphicchecker {
 void check();
}
class AutomorphicNumber implements Numberinput,Automorphicchecker {
    int number;
AutomorphicNumber(int number) {
    this.number=number;
}
public void numberr() {
    System.out.println(number);
}
public void check() {
    int rem=0, sum=0,square=0;
    square = square+(number*number);
   
    if(number>0) {
        rem = square%10;
        sum+=rem;
        square = square/10;
        
    }
    
    if(number==sum) {
        System.out.println(number+" is Automorphic Number ");
    }
    else {
        System.out.println(number+" is not Automorphic Number ");
    }
}
}
class Main {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");
int number = sc.nextInt();

AutomorphicNumber auto= new AutomorphicNumber(number);
auto.numberr();
auto.check();

}
}
