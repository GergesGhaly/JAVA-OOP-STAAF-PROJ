/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Department IT = new Department(1, "Information Technology");
        SalariedEmployee employee1 = new SalariedEmployee(Gender.meal,"jhon",5,"5 jhonas street",1500,200,2.5);
        IT.addEmployee(employee1);
        System.out.println(IT.getEmployeeCount());
        employee1.DisplayAllData();

    }
}