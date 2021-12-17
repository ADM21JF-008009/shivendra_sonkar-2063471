import java.util.stream.Stream;
import java.util.*;
public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {
       Employee em[]=new Employee[details.length];
       int i=0;
       for(String e:details){
          String s[]=e.split(";");
          Employee a=new Employee();
          a.setEmpId(s[0]);
          a.setEmpName(s[1]);
          a.setSalary(Double.parseDouble(s[2]));
          em[i]=a;
          i+=1;
       }
		return em;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
        Stream<Employee> em=Stream.of(empDetails);
        return em;
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
	       List<String> b=new ArrayList<>();
           empStream.filter(e->e.getSalary()>=minSalary).forEach(x->{
               String res="";
               res+=x.getEmpId()+" "+x.getEmpName()+" "+x.getSalary();
               b.add(res);
           });
           String s[]=new String[b.size()];
           int i=0;
           for(String s1:b){
               s[i]=s1;
               i++;
           }
           Arrays.sort(s);
           return s;
	}

}
