package designpatterns.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeesTest {
    @Test
    void testGetInstance() throws CloneNotSupportedException {
        Employees prototypeEmployees = new Employees();

        prototypeEmployees.loadData();
        assertEquals(new ArrayList<String>(Arrays.asList("Raj", "David", "Lisa")), prototypeEmployees.getEmpList());

        Employees empsOne = (Employees) prototypeEmployees.clone();
        List<String> emps = empsOne.getEmpList();
        emps.add("Jarrod");
        emps.remove("David");
        assertEquals(new ArrayList<String>(Arrays.asList("Raj", "Lisa", "Jarrod")), empsOne.getEmpList());

        Employees empsTwo = (Employees) prototypeEmployees.clone();
        emps = empsTwo.getEmpList();
        emps.remove("Lisa");
        emps.remove("Raj");
        emps.add("Michael");
        assertEquals(new ArrayList<String>(Arrays.asList("David", "Michael")), empsTwo.getEmpList());
    }
}
