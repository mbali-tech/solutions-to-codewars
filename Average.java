/*Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.*/
public class Average{
  public static double find_average(int[] array){
  double sum=0;
  double avg=0;
  for (int i=0;i<array.length;i++)
      sum+=array[i];
      
      avg=sum/array.length;
      return avg;
    
  }
}