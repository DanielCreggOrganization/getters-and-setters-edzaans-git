public class Person {

    // Instance Variables(String=firstName,)
    private String firstName;
    private String middleNames;
    private String lastName;
    private String userName;
    


      //Setter Methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames;
    }
     public void setLastName(String lastName) {
        this.firstName = userName;
    }
      public void setUserName(String userName) {
        if(userName.length() > 10) {
            this.userName = userName.substring(0,10);
        }
        else {
            this.userName = userName;
        }
    }
    

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }
     public String getMiddleNames() {
        return middleNames;
    }
     public String getLastName() {
        return lastName;
    }
     public String getUserName() {
        return userName;
    }

}
