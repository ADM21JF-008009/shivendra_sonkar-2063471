import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails(){
        Scanner sc=new Scanner(System.in);
        Hosteller host=new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id=sc.nextInt();
        host.setStudentId(id);
        System.out.println("Student Name");
        String name=sc.nextLine();
        host.setName(name);
        System.out.println("Department Id");
        int depId=sc.nextInt();
        host.setDepartmentId(depId);
        System.out.println("Gender");
        String gender=sc.nextLine();
        host.setGender(gender);
        System.out.println("Phone Number");
        String phone=sc.nextLine();
        host.setPhone(phone);
        System.out.println("Hostel Name");
        String hosName=sc.nextLine();
        host.setHostelName(hosName);
        System.out.println("Room Number");
        int room=sc.nextInt();
        host.setRoomNumber(room);
        String modRoom=sc.nextLine();
        System.out.println("Modify Room Number(Y/N)");
        if(modRoom.equals("Y")){
            System.out.println("New Room Number");
            int updateRoom=sc.nextInt();
            host.setRoomNumber(updateRoom);
        }
        System.out.println("Modify Phone Number(Y/N)");
        String modPhone=sc.nextLine();
        if(modRoom.equals("Y")){
            System.out.println("New Phone Number");
            String updateNumber=sc.nextLine();
            host.setPhone(updateNumber);
        }
        return host;
    }
    public static void main(String args[]){
        Main ma=new Main();
        Hosteller host=ma.getHostellerDetails();
        System.out.println("The Student Details");
        System.out.println(host.getStudentId()+" "+host.getName()+" "+host.getDepartmentId()+" "+host.getGender()+" "+host.getPhone()+" "+host.getHostelName()+" "+host.getRoomNumber());
    }
}