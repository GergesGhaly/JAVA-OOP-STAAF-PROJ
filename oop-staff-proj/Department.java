import java.util.ArrayList;

public class Department {

    int Department_Number ;
    String Department_Name ;
    ArrayList <Employee> Employee_List;



    public Department() {
    }

    public Department(int Department_Number, String Department_Name) {
        this.Department_Number = Department_Number;
        this.Department_Name = Department_Name;
        Employee_List = new ArrayList<Employee>() ;
    }

    public int getDepartment_Number() {
        return this.Department_Number;
    }

    public void setDepartment_Number(int Department_Number) {
        this.Department_Number = Department_Number;
    }

    public String getDepartment_Name() {
        return this.Department_Name;
    }

    public void setDepartment_Name(String Department_Name) {
        this.Department_Name = Department_Name;
    }

    public void addEmployee(Employee employee){
        Employee_List.add(employee);
    }

    public void removeEmployee(int id){
        Employee_List.remove(id);
    }

    public int getEmployeeCount(){
        return Employee_List.size();
    }

    public void printBasicData(){
        for(int i=0; i>Employee_List.size();i++){

            System.out.println(Employee_List.get(i).GetSSN()+ "" +Employee_List.get(i).GetName()+ " " +Employee_List.get(i).GetAdress());
        }
    }

    public void printAllData(){
        for(int i=0; i>Employee_List.size();i++){
                if(Employee_List.get(i) instanceof SalariedEmployee){
                   ((SalariedEmployee) Employee_List.get(i)).DisplayAllData();
                }
                if(Employee_List.get(i) instanceof HourlyEmployee){
                    ((HourlyEmployee) Employee_List.get(i)).DisplayAllData();
                 }
                 if(Employee_List.get(i) instanceof CommissionEmployee){
                    ((CommissionEmployee) Employee_List.get(i)).DisplayAllData();
                 }

 
        }
    }


    // public ArrayList<Employee> getEmployee_List() {
    //     return this.Employee_List;
    // }

    // public void setEmployee_List(ArrayList<Employee> Employee_List) {
    //     this.Employee_List = Employee_List;
    // }

}