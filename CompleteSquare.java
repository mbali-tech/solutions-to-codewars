//Complete the square sum function so that it squares each number passed into it and then sums the results together.

public class Kata
 {
  public static int squareSum(int[] n)
  { 
   int sum = 0;
   for(int i: n)
     sum += i * i;
    return sum;
  }
 }