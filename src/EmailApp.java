//Generate an email with the following syntax: firstname.lastname@department.company.com
//Determine the department (sales, development, accounting) if none leave blank
//generate a random String for a password
//have set methods to change the password, set the mail box capapcity, and define and alternate email adress;
// have get methods to display the name, email and mailbox capacity;

public class EmailApp {
    public static void main(String[] args) {
        Email eml = new Email("John", "Smith");
        System.out.println(eml.showInfo());
    }
}
