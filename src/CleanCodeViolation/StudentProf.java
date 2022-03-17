package CleanCodeViolation;

public class StudentProf implements ProfessorTask{
    @Override
    public void settingPaper() {
        System.out.println("Setting questions for UT-2 ");
    }

    @Override
    public void teaching() {
        System.out.println("Teaches MicroProcessors for Final Year");

    }

    @Override
    public void invigilator() {
        System.out.println("Will be invigilating for 3rd year Students");

    }
}
