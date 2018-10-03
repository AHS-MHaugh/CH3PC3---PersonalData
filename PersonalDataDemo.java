/*
 * Michael Haugh
 * AP CS
 * CH3PC3
 * 10-1-18
 */

public class PersonalDataDemo {
        //^This is the class.^
    
    public static void main(String[] args) {
        PersonalData p = new PersonalData ("Mike Haugh", "188 Green Brae Road", 
        17, 8675309);
        // ^This is the object.^
        
        System.out.println("My name is " + p.getName() + ", my house address is " 
        + p.getHouseAddress() + ", I am " + p.getAge() + " years old, and my "
        + "phone number is " + p.getPhoneNumber() + ".");
        // ^This is the print command.^
        
        
        PersonalData q = new PersonalData ("Charlie Goodman", "412 Columbus Avenue", 
        18, 8594312 );
        // ^This is the object.^
        
        System.out.println("My name is " + q.getName() + ", my house address is " 
        + q.getHouseAddress() + ", I am " + q.getAge() + " years old, and my "
        + "phone number is " + q.getPhoneNumber() + ".");
        // ^This is the print command.^
        
        
        PersonalData r = new PersonalData ("Jason Buntz", "17 Buntz Road", 
        87, 9545542);
        // ^This is the object.^

        System.out.println("My name is " + r.getName() + ", my house address is " 
        + r.getHouseAddress() + ", I am " + r.getAge() + " years old, and my "
        + "phone number is " + r.getPhoneNumber() + ".");
        // ^This is the print command.^
    }
    
}
