import java.util.*;
public class ArrayException{
    int index;
    public String getPriceDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int a=sc.nextInt();
        int array[]=new int[a];
        try{
        System.out.println("Enter the price details");
        for(int i=0;i<a;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the index of the array element you want to access");
            index=sc.nextInt();
           int val= array[index];
        }catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }
        catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
        return "The array element is "+array[index];
    }
    public static void main(String args[]){
        ArrayException array=new ArrayException();
        System.out.println(array.getPriceDetails());
    }
}