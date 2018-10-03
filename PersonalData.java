 /*
 * Michael Haugh
 * AP CS
 * CH3PC3
 * 10-1-18
 */

public class PersonalData {
    // ^This is the class.^
    
    private String name;
    private String houseAddress;
    private int age;
    private int phoneNumber;
    // ^These are the variables.^
    
    public PersonalData(String n, String h, int a, int p) {
        // ^This is the constructor.^
        
        name = n;
        houseAddress = h;
        age = a;
        phoneNumber = p;
        // ^These are the attributes.^
    }
    
    public void setName(String n){
        name = n;
        // ^This is the mutator method.^
    }
    public String getName(){
        return name;
        // ^This is the accessor method.^
    }
    
    public void setHouseAddress(String h){
        houseAddress = h;
        // ^This is the mutator method.^
    }
    public String getHouseAddress(){
        return houseAddress;
        // ^This is the accessor method.^
    }
    
    public void setAge(int a){
        age = a;
        // ^This is the mutator method.^
    }
    public int getAge(){
        return age;
        // ^This is the accessor method.^
    }
    
    public void setPhoneNumber(int p){
        phoneNumber = p;
        // ^This is the mutator method.^
    }
    public int getPhoneNumber(){
        return phoneNumber;
        // ^This is the accessor method.^
    }
}
