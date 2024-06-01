public class BassPlusCommissionEmployee extends CommissionEmployee {
   private double Base;

@Override
public double Earning() {
    return Base + super.Earning();
    
}
    public void SetBase(double Base){
        this.Base = Base;
    }
    public double getBase() {
        return Base;
    }
    @Override
    public void DisplayAllData() {
        super.DisplayAllData();
        DisplayEarning();
    }
    @Override
    public void DisplayEarning() {
       System.out.println(Earning());
    }

    
}
