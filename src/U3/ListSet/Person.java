package U3.ListSet;

public class Person extends Object {
    String name;
    String lastname;
    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
    public boolean equals(Object elm) {
        if(this == elm) {
            return true;
        }

        if(elm == null) {
            return false;
        }

        if(elm.getClass() != Person.class) {
            return false;
        }

        Person p = (Person) elm;
        if(p.name.equals(this.name) && p.lastname.equals(this.lastname)) {
            return true;
        }else {
            return false;
        }
    } 
}
