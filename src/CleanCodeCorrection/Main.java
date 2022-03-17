package CleanCodeCorrection;


import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("********* Single Responsibility Principle *******");

        TeacherDetails teacher = new TeacherDetails("PRAKHAR",20, "SrTeacher");
        teacher.printDetails();

        System.out.println("********* Open Close Principle *******");
        SalCalculation mySal = new JrTeacher();
        SalCalculation mySal1 = new SrTeacher();

        double sal =  mySal1.calSalary(teacher);
        System.out.println(sal);

        System.out.println("********* Liskov Substitution Principle *******");

        PartTimeTeacher professor = new ExternalExaminer();
        professor.partTime();
        //professor.wifiAccess();

        System.out.println("********* Interface Segregation Principle *******");

        StudentProf sTeacher = new StudentProf();
        //sTeacher.invigilator();
        sTeacher.teaching();
        //sTeacher.settingPaper();
        System.out.println("********* Dependency Inversion Principle *******");

        EmployeeRepository staff = StaffCollection.create();
        List<String> allProduct = staff.getAllProductNames();
        for(int i = 0; i<allProduct.size();i++){
            System.out.println(allProduct.get(i));
        }

    }
}
