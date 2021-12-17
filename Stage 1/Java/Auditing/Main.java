import java.util.*;
import java.util.stream.*;
public class Main{
	
	private static Map <String,Double> employeeMap=new LinkedHashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	public static EmployeeAudit findEmployee()
	{
	    EmployeeAudit m=(s)->{
		 ArrayList<String> b=new ArrayList<>(employeeMap.keySet().stream().filter(x->employeeMap.get(x)<=s).collect(Collectors.toList()));
		  return b;
		};
		return m;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Main m=new Main();
		while(true){
		System.out.println("1. Add Employee details");
		System.out.println("2. Find Employee details");
		System.out.println("3. Exit");
		System.out.println("Enter the choice");
		int first=sc.nextInt();
		if(first==1){
		    System.out.println("Enter the Employee name");
		    String s=sc.next();
		    System.out.println("Enter the Employee Salary");
		    double db=sc.nextDouble();
		    m.addEmployeeDetails(s,db);
		  }else if(first==2){
		      System.out.println("Enter the salary to be searched");
		      double sal=sc.nextDouble();
		      System.out.println("Employee List");
		      EmployeeAudit enp=m.findEmployee();
		      ArrayList<String> b=enp.fetchEmployeeDetails(sal);
		      if(b.isEmpty()){
		          System.out.println("No Employee Found");
		      }else{
		      b.forEach(e->System.out.println(e));
		      }
	    }
		 else if(first==3){
		     System.out.println("Let's complete the session");
		    break;
		 }
		}
	}

}
