package rocks.zipcodewilmington;

import java.util.Date;

/**
 * @author leon on 6/26/18.
 */
public class Person {
    private final Integer myId;
    private final String name;
    private final Date birthdate;
    public Person() {

    }
    public Person(Integer id, String name, Date birthdate) {
        this.myId = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getMyId() {
        return myId;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myId=" + myId +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            return true;
        }

        Person somePerson = (Person)obj;
        boolean sameId = this.myId == somePerson.getMyId();
        boolean sameName = this.name == somePerson.getName();
        boolean sameBirthdate = this.birthdate == somePerson.getBirthdate();
        boolean haveIdenticalContents = sameId && sameName && sameBirthdate;

        return haveIdenticalContents;
    }
}