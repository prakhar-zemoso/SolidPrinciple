package CleanCodeViolation;

import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("********* Single Responsibility Principle *******");

        TeacherDetails teacher = new TeacherDetails("PRAKHAR",20, "JrTeacher");
        teacher.printDetails();
        System.out.println("********* Open Close Principle *******");

        double mySal = teacher.calSalary(teacher.type);
        System.out.println(mySal);

        System.out.println("********* Liskov Substitution Principle *******");

        TeacherRole professor = new ExternalExaminer();
        professor.partTime();
        //professor.wifiAccess();

        System.out.println("********* Interface Segregation Principle *******");

        StudentProf sTeacher = new StudentProf();
        sTeacher.invigilator();
        sTeacher.teaching();
        sTeacher.settingPaper();

        System.out.println("********* Dependency Inversion Principle *******");

//        NonTeachingStaff nt = new NonTeachingStaff();
//        List<String> allProduct = nt.getAllNonTeaching();
//        for(int i = 0; i<allProduct.size();i++){
//            System.out.println(allProduct.get(i));
//        }
        TeachingStaff ts = new TeachingStaff();
        List<String> allProduct = ts.getAllTeaching();
        for(int i = 0; i<allProduct.size();i++){
            System.out.println(allProduct.get(i));
        }

    }
}
