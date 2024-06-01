public class SalariedEmployee extends Employee implements Displayaple {
    double Salary;
    double Bonus;
    double Deducations;

    public SalariedEmployee() {

    }

    public SalariedEmployee(Gender Gender, String Name, int SSN, String Adress, double Salary, double Bonus,double Deducations) {
        super(Gender, Name, SSN, Adress);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deducations = Deducations;
    }

    public void SetSalary(double Salary) {
        this.Salary = Salary;
    }

    public void SetBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    public void SetDeducations(double Deducations) {
        this.Deducations = Deducations;
    }

    // override Employee abstract method

    public double Earning() {
        return (Salary+Bonus)-Deducations;
    }

    // override Displayaple interfac method
    @Override
    public void DisplayAllData() {
       System.out.println(super.toString());
       System.out.println(toString());

    }
    // override Displayaple interfac method

    @Override
    public void DisplayEarning() {
        System.out.println(Earning());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + Salary + ", bonus=" + Bonus + ", deductions=" + Deducations + '}';

    }

}
