package InsertionSort;

public class Sorting {
    public static void main(String[] args) {
        
    
int Num[]={25,57,48,37,12,92,86,33};
int n=Num.length;
for(int i=1;i<n;i++){
    int temp=Num[i];
    int j=i-1;
     while  (j>=0 && j>temp){
        Num[j + 1] = Num[j];
        j = j - 1;
    }
    Num[j + 1] = temp;
}

// Print the sorted array
System.out.println("Sorted Array:");
for (int num : Num) {
    System.out.print(num + " ");
}
}
}



