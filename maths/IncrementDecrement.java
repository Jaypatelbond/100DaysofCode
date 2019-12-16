
/**
 *
 * @author Jaypatelbond
 */
public class IncrementDecrement {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b; //++b means b= b+1; c=b;
        d = a++; //a++ means d=a; a= a+1
        c++;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
    
}
