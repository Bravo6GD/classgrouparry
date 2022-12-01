package models;

import java.util.ArrayList;

public class group {
    public group(ArrayList<students> group, String name) {
        this.group = group;
        this.name = name;
    }

    public ArrayList<students> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<students> group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<students> group = new ArrayList<students>();
    String name;
}
