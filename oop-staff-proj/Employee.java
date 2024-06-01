enum Gender {meal,female};
public abstract class Employee {

    Gender Gender ;
     String Name;    
     int SSN ;
    String Adress;

    public Employee(){

    }

    public Employee(Gender Gender,String Name,int SSN,String Adress){
        this.Gender=Gender;
        this.Name=Name;
        this.SSN=SSN;
        this.Adress=Adress;

    }


    public void  SetGender(Gender Gender){
        this.Gender = Gender;
    }

    public Gender  GetGender(){
        return Gender;
    }

    public void  SetName(String Name){
        this.Name = Name;
    }

    public String  GetName(){
       return Name;
    }
    public void  SetAdress(String Adress){
        this.Adress = Adress;
    }

    public String  GetAdress(){
       return Adress;
    }

    public void  SetSNN(int SSN){
        this.SSN = SSN;
    }

    public int  GetSSN(){
       return SSN;
    }

    public abstract double Earning();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Gender:"+Gender+" "+"Name:"+Name+" "+"Adress:"+Adress+""+"SNN:"+SSN;
    }

}