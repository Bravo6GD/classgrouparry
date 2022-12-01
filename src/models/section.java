package models;

import java.util.ArrayList;

public class section {
    public section(ArrayList<group> section, String name) {
        this.section = section;
        this.name = name;
    }

    public ArrayList<group> getSection() {
        return section;
    }

    public void setSection(ArrayList<group> section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<group> section = new ArrayList<group>();
    String name;
}

