public class HourlyEmployee extends Employee implements Displayaple {

    private double Hour_rate;
    private int Number_of_hours;


public HourlyEmployee(){

}

public HourlyEmployee(Gender Gender, String Name, int SSN, String Adress,double Hour_rate,int Number_of_hours){
    super(Gender, Name, SSN, Adress);
    this.Hour_rate=Hour_rate;
    this.Number_of_hours=Number_of_hours;
}

public void SetHourRate(double Hour_rate){
   this.Hour_rate = Hour_rate;
}

public void SetNumberOfHours(int Number_of_hours){
    this.Number_of_hours = Number_of_hours;
 }
 
    // override Employee abstract method

    public double Earning() {
        return Hour_rate*Number_of_hours;
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
        System.out.println("Hourly Employee Earning: " + Earning());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + Hour_rate + ", no_of_hours=" + Number_of_hours + '}';
    }

}
