
/**
 *
 * @author Jaypatelbond
 */
public class ByteShift {
 public static void main (String args[]){
    byte a = 64 , b;
    int i;
    i = a << 2; // Value 64 (0100 0000) is being shifted twice (1000 0000) whuch is 256.
    b = (byte) (a << 2);
    System.out.println("Original Value of a: " +a);
    System.out.println("i and b: "+ i + " and " +b);
 }   
}
