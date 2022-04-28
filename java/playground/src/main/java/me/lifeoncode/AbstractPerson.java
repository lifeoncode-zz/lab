package me.lifeoncode;

public abstract class AbstractPerson {
    private String name;
    private String gender;

    public AbstractPerson(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
