package CleanCodeCorrection;

public class SrTeacher extends SalCalculation {
    public double calSalary(TeacherDetails teacher) {
        int sal = 0;
        if (teacher.type == "SrTeacher") {
            sal = 30 * 1200;
            System.out.println("Bonus for JrTeacher");

        }
        return sal;
    }
}

