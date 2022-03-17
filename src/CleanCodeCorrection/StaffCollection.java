package CleanCodeCorrection;

public class StaffCollection {
    public static EmployeeRepository create(){
        return new NonTeachingStaff();
    }
}
