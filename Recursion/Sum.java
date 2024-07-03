package Recursion;



//  ITERATION
public class Sum {
 
   static int sum=0;
   int iterativeWay(int num){
    for(int i=1;i<=num;i++){
        sum+=i;
    }
    return sum;
}



int recursiveWay(int num) {
  if (num == 0) {
      return 0;
  }
  return num + recursiveWay(num - 1);
}


int facTORIAL(int num){
  if(num==0||num==1){
    return 1;

  }
return num*facTORIAL(num-1);
}



int fibonacciNumber(int n) {
  if (n <= 1) {
    return n;
  }
  return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
}



}


class  Output{
    public static void main(String[] args) {
      Sum s=new Sum();
      System.out.println("the sum is: "+ s.iterativeWay(5));
      System.out.println("the sum is: " + s.recursiveWay(10)); 
      System.out.println("the factorial is: "+ s.facTORIAL(5));
      System.out.println("the fiboniicii number is: "+ s.fibonacciNumber(10));

      int num = 5; 
      int factorial = 1; 
      for (int i = 1; i <= num; i++) {
          factorial *= i;
      }
      System.out.println("Factorial of " + num + " is " + factorial);
    }
  }

