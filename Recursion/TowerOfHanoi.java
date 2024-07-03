package Recursion;

public class TowerOfHanoi {
    public static void TOH(int n, char x, char y, char z) {

     if(n==1){
        System.out.println("source moved to destination");
     }
        if (n > 1) {
         
            TOH(n - 1, x, z, y);

        
            System.out.println("Move disk " + n + " from  " + x + " to  " + y);

        
            TOH(n - 1, z, y, x);
        }
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        char x = 'A'; // starting 
        char y = 'B'; // auxiliary 
        char z = 'C'; // destination 

        TOH(n, x, y, z);
    }
}