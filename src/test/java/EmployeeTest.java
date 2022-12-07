import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee employeePass = new Employee("Janedoe", 123412341234L);
    Employee employeeFail = new Employee("Jane", 1234L);

    @BeforeEach
    void setUp() {
    }

    @Test
    void nameTestPass(){
        assertEquals("Janedoe", employeePass.name);
    }

    @Test
    void nameTestFail(){
        assertEquals("Jane", employeeFail.name);
    }


    @Test
    void numTestPass(){
        assertEquals(123412341234L, employeePass.number);
    }

    @Test
    void numTestFail(){
        assertEquals(1234L, employeeFail.number);
    }

    @AfterEach
    void tearDown() {
    }
}
