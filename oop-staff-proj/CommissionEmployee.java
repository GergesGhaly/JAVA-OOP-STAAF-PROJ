public class CommissionEmployee extends Employee implements Displayaple {

     double Gross_Sales;
     double Commission_Rate;

    public CommissionEmployee() {

    }

    public CommissionEmployee(Gender Gender, String Name, int SSN, String Adress, Double Gross_Sales,
            double Commission_Employee) {
        super(Gender, Name, SSN, Adress);
        this.Gross_Sales = Gross_Sales;
        this.Commission_Rate = Commission_Employee;
    }

    // override Employee abstract method

    public double Earning() {
        return Gross_Sales + Commission_Rate;
    }

    public void SetGross_Sales(double Gross_Sales) {
        this.Gross_Sales = Gross_Sales;
    }

    public void SetCommission_Rate(double Commission_Rate) {
        this.Commission_Rate = Commission_Rate;
    }

    // override Displayaple interfac method

    @Override
    public void DisplayEarning() {
        System.out.println(Earning());
    }

    // override Displayaple interfac method
    @Override
    public void DisplayAllData() {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    // override Displayaple interfac method

    @Override
    public String toString() {
        return "Commission_Employee{" + "gross_sales=" + Gross_Sales + ", commission_rate=" + Commission_Rate + '}';
    }

}
