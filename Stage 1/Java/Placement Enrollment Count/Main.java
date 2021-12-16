import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;
public class Main {

	public static void main(String[] args) {
        Main a=new Main();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
        String s=sc.next();
        System.out.println("Enter the department name acronym");
        String ac=sc.next();
        Stream<String> stream2=a.getRollNumbers(s);
        int count=a.getCount(stream2,ac);
        if(count>0){
        System.out.println("Number of students in "+ac+" is "+count);
        }else{
            System.out.println("No students from "+ac);
        }
	}
	public static Stream<String> getRollNumbers(String rollNumbers) {
		String a[]=rollNumbers.split(",");
         return Stream.of(a);
	}
	public static int getCount(Stream<String> rollNumberStream, String dept) {
       List<String> ls=new ArrayList(rollNumberStream.filter(x->x.substring(0,2).equalsIgnoreCase(dept)).collect(Collectors.toList()));
       return ls.size();
	}

}
