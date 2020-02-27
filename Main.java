public class Main {
   public static void main (String args[]) {
       Person person = new Person();
       person.setFirstName("Freddy");
       System.out.println(person.getFirstName());

         Person person2 = new Person();
       person2.setMiddleNames("Middler");
       System.out.println(person2.getMiddleNames());

       Person userNameObj= new Person();
       userNameObj.setUserName("theRedRhino"); 
       System.out.println(userNameObj.getUserName());
   }
}
