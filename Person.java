public class Person {
    // Instance Variables(String=firstName,)
    private String firstName;
    private String middleNames;
    private String userName;

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }
     public String getMiddleNames() {
        return middleNames;
    }
     public String getUserName() {
        return userName;
    }

    //Setter Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     public void setMiddleName(String middleNames) {
        this.middleNames = middleNames;
    }
     public void setLastName(String userName) {
        this.firstName = userName;
    }

}
