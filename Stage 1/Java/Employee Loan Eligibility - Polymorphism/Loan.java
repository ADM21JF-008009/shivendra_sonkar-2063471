
public class Loan {
	
	//Implement the below method 
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee){
		    double loan= (employeeObj.getSalary()*15)/100;
		    return loan;
		}
		else if(employeeObj instanceof TemporaryEmployee){
		    double loan= (employeeObj.getSalary()*10)/100;
		    return loan;
		}
		return 0;
	}

}
