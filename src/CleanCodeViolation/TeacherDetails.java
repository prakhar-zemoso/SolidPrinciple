package CleanCodeViolation;

public class TeacherDetails {
    String name;
    String type;
    int age;

    TeacherDetails(String name,int age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public double calSalary(String type){
        double sal = 0;

        if(type == "JrTeacher"){
            sal = 30*800;
        }
        else if(type == "SrTeacher"){
            sal = 30 * 1500;
        }
        else if (type == "Non Teaching"){
            sal = 30 * 300;
        }
        return sal;
    }
    public void printDetails(){
        System.out.println(name+ " is a teacher at "+type+" level");
    }


}
