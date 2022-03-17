package CleanCodeCorrection;

public class JrTeacher extends SalCalculation{
    public double calSalary(TeacherDetails teacher) {
        int sal = 0;

        sal = 30 * 800;
        System.out.println("Bonus for JrTeacher");


        return sal;
    }
}
