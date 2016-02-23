import java.util.Scanner;
import java.math.BigInteger;

public class BigFactorial
{
  public static void main(String args[])
  {
    int n, c;
    int trailingZeros = 0;
    BigInteger inc = new BigInteger("1");
    BigInteger fact = new BigInteger("1");
    BigInteger ten = new BigInteger("10");
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input an integer");
    n = input.nextInt();
 
    for (c = 1; c <= n; c++) {
      fact = fact.multiply(inc);
      inc = inc.add(BigInteger.ONE);
    }
 
    System.out.println(n + "! = " + fact);
    System.out.println(fact.mod(BigInteger.TEN).equals(0));
    
    while(fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
    	
    	trailingZeros++;
    	fact = fact.divide(BigInteger.TEN);
    }
    
    System.out.println("Trailing Zeros = " + trailingZeros);
    
    
    input.close();
  }
}