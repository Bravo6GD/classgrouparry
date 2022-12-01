package models;

public class students {
    int id;
    String name;

    public students(int id, String name, int roll_number) {
        this.id = id;
        this.name = name;
        this.roll_number = roll_number;
    }

    int roll_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public students(int id, String name, int roll_number, String gender) {
        this.id = id;
        this.name = name;
        this.roll_number = roll_number;
        this.gender = gender;
    }

    String gender;
}
