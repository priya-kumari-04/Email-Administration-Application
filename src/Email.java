import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";
    //constructor to rcv first and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName= lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        // call a method that return department
        this.department = setDepartment();
        System.out.println("Department is: " + this.department );
        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is:  " + this.password);
        //combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("your email is " + email);
    }
    //ask for department
    private String setDepartment(){
        System.out.println("ENTER THE DEPARTMENT\n1 for sales\n2 for development\n3 for accounts\n0 for none");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounts";
        } else {
            return "None";
        }
    }
    // generate a random password
    private String randomPassword(int length){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!234%6&*";
        char[] password = new char[length];
        for(int i = 0; i< length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set mail box capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = mailboxCapacity;
    }
    // set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "COMPANY EMAIL: " + email + "MAILBOX CAPACITY" + mailboxCapacity;
    }
}
