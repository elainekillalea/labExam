import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    private Employee e1;

    @BeforeEach
    public void setUp() {
    }

    @Test
    void testObjPass(){
        Employee employeePass = new Employee("Janedoe", 123412341234L);
        assertEquals("Janedoe", employeePass.name);
    }

    @Test
    void testObjFail(){
        Employee employeeFail = new Employee("Jane", 1234L);
        assertEquals("Jane", employeeFail.name);
    }

    @Test
    void nameTestPass(){
        e1 = new Employee("Janedoe", 123412341234L);
        assertEquals("Janedoe", e1.getName());
    }

    @Test
    void nameTestFail(){
        Exception exception = assertThrows(Exception.class, () -> e1.setName("Jane"));
        assertEquals("Name must be at least 5 characters", exception.getMessage());
    }


    @Test
    void numTestPass(){
        Employee e1 = new Employee("Janedoe", 123412341234L);
        assertEquals(123412341234L, e1.getNumber());
    }

    @Test
    void numTestFail(){
        Exception exception = assertThrows(Exception.class, () -> e1.setNumber(12341234L));
        assertEquals("Employee Number must be 12 digits", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}
