/*class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    public Employee()
    {
        firstName = null;
        lastName = null;
        ssn = null;
    }
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    String validateName(String firstName,String lastName) throws Exception
    {
        try {
            if (firstName == null || lastName == null) {
                Exception NullPointerException = new NullPointerException("Entry Missing");
                throw NullPointerException;
            } else if (firstName.length() == 0 || lastName.length() == 0)
            {
                Exception StringIndexOutOfBoundsException = new
                        StringIndexOutOfBoundsException("Index out of bound");
                throw StringIndexOutOfBoundsException;
            }else if(Character.isDigit(firstName.charAt(0)) || Character.isDigit(lastName.charAt(0)))
            {
                Exception IllegalArgumentException = new IllegalArgumentException("First Character is invalid");
                        throw IllegalArgumentException;
            }

            setFirstName(firstName);
            setLastName(lastName);
            return "Valid String";

        }catch(NullPointerException n)
        {
            n.getMessage();
            return "";
        }
        catch(StringIndexOutOfBoundsException s)
        {
            s.getMessage();
            return "";
        }
        catch(IllegalArgumentException i)
        {
            i.getMessage();
            return "";
        }
    }
}



public class Source {
    public static void main(String[]args){

    }
}*/
