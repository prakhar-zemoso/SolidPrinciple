package CleanCodeCorrection;

import java.util.Arrays;
import java.util.List;

public class SecurityStaff implements EmployeeRepository {

    @Override
    public List<String> getAllProductNames() {
        return Arrays.asList("Chulbul","Singham","Simba");
    }
}
