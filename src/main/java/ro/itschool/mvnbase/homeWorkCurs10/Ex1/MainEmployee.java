package ro.itschool.mvnbase.homeWorkCurs10.Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jake", 26, "blonde", "KFC", 699));
        employees.add(new Employee("Adam", 42, "brown", "WizzAir", 1000));
        employees.add(new Employee("Francesco", 34, "brown", "Tomaco", 2500));
        employees.add(new Employee("Katrin", 35, "blonde", "WizzAir", 1250));
        employees.add(new Employee("Anabelle", 40, "red", "KFC", 500));
        employees.add(new Employee("Diego", 25, "brown", "Mercedes", 3000));
        employees.add(new Employee("Clementina", 28, "black", "RER", 400));
        employees.add(new Employee("Natalia", 28, "red", "Studio20", 2000));

        System.out.println(employeeBySalary(employees, 800));
        System.out.println(mapCompany(employees));
        System.out.println(salariesSum(employees));
        System.out.println(biggestSallary(employees));
    }

    public static List<String> employeeBySalary(List<Employee> employee, int salaryInput) {
        List<String> employeeBySalary = new ArrayList<>();
        for (Employee element : employee) {
            if (element.getSalary() > salaryInput) {
                employeeBySalary.add(element.getName());
            }
        }
        return employeeBySalary;
    }

    public static Map<String, List<String>> mapCompany(List<Employee> employees) {
        Map<String, List<String>> mapComp = new HashMap<>();
        for (Employee empl : employees) {
            List<String> name = mapComp.get(empl.getCompany());
            if (name == null) {
                name = new ArrayList<>();
                mapComp.put(empl.getCompany(), name);
            }
            name.add(empl.getName());
        }
        return mapComp;
    }

    public static Integer salariesSum(List<Employee> employees) {
        int salariSum=0;
        for (Employee element: employees){
            salariSum+=element.getSalary();
        }
        return salariSum;
    }

    public static String biggestSallary(List<Employee>employees){
        String biggestSallaryCompany="";
        int salary=0;
        for (Employee component:employees){
            if (component.getSalary()>salary){
                salary=component.getSalary();
                biggestSallaryCompany=component.getCompany();
            }
        }
        return biggestSallaryCompany+ " offer " +salary;
    }
}
