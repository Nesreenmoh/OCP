

public class Person {

    private String name;
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // override the equal method of Object class
    public boolean equals(Object o) {
        System.out.println("From Equal ");
        if (o == null) return false;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return this.name.equals(person.name) &&
                this.phone.equals(person.phone);
    }

    // override HashCode method of Object class

    public int hashCode(){
        System.out.println("From Hascode");
        return this.name.hashCode();
    }
}
