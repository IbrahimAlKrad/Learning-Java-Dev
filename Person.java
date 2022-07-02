public class Person {

    private String firstName, lastName;
    private int age;

    //getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (0<age & age<100) {
            this.age = age;
        }
    }

    //fullname
    public String getFullName (){
    if ( this.firstName.isEmpty() && this.lastName.isEmpty() ){
      return "";
    }
    if ( this.lastName.isEmpty() ){
      return this.firstName;
    }
    if ( this.firstName.isEmpty() ){
      return this.lastName;
    }else {
      return this.firstName +" " + this.lastName;
    }
  }

  public static void main(String[] args) {
    
  }
    
}
