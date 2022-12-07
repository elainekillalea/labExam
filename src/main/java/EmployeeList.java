import java.util.ArrayList;

public class EmployeeList {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(String nm, long num) throws Exception{
        Employee newEm = new Employee(nm, num);
        String search = Long.toString(num);
        int searchLength = employees.size();
        for (int i = 0; i < searchLength; i++) {
            if (employees.get(i).getName().contains(search)) {
                employees.add(newEm);
            }
            else{
                throw new Exception("Cannot add employee");
            }
        }
    }
}

