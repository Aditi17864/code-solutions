import java.util.Scanner;

public class linearse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        //Entering array elements loop
        System.out.println("Enter Elements");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element that you want to search");
        int key = sc.nextInt();
        
        boolean found = false;
        for(int i = 0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Elements found at position:"+(i+1));
                found = true;
                break;
                
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}