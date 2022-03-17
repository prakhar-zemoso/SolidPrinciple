package CleanCodeViolation;

public class ExternalExaminer extends TeacherRole {
    @Override
    public void partTime() {
        System.out.println(".....Is an external Viva Examiner");
    }
    public void takesViva(){
        System.out.println("....viva and practical expert");
    }

    @Override
    public void wifiAccess() {

        throw new RuntimeException("No Support");

    }
}
