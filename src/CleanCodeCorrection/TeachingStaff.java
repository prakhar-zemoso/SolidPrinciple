package CleanCodeCorrection;

import java.util.Arrays;
import java.util.List;

public class TeachingStaff implements EmployeeRepository{

    @Override
    public List<String> getAllProductNames() {
        return Arrays.asList("Sunny","Munni","Robert");
    }
}
