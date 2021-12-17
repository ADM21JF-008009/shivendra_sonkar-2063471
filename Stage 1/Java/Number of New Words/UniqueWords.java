import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student's Article");
      String s=sc.nextLine();
      String s1[]=s.replaceAll("[,;:.?! ]"," ").split(" ");
      TreeSet<String> s2=new TreeSet<>();
      int count=0;
      for(String s3:s1){
          if(s3.length()>0){
              s2.add(s3.toLowerCase());
              count+=1;
          }
      }
      System.out.println("Number of words "+count);
      System.out.println("Number of unique words "+s2.size());
      System.out.println("The words are");
      count=1;
      for(String s3:s2){
          System.out.println(count+"."+s3);
          count+=1;
      }
  }
}