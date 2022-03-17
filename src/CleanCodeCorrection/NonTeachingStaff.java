package CleanCodeCorrection;

import java.util.Arrays;
import java.util.List;

public class NonTeachingStaff implements EmployeeRepository {
    @Override
    public List<String> getAllProductNames() {
        return Arrays.asList("Don","Sheela","Rohan","Rohit");

    }
}
