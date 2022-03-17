package CleanCodeCorrection;

public class TeacherDetails {
    String name;
    String type;
    int age;

    TeacherDetails(String name,int age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public void printDetails(){
        System.out.println(name+ " is a teacher at "+type+" level");
    }
}
