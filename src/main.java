import models.group;
import models.section;
import models.students;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        students s1 = new students(1,"Anshu",23024,"female");
        students s2 = new students(2,"Biplov",23025,"male");
        students s3 = new students(3,"Aswin",23026,"male");
        students s4 = new students(4,"Bikarsha",23027,"male");

        students s5 = new students(5,"Ashraya",23066,"male");
        students s6 = new students(6,"Aashutosh",23004,"male");
        students s7 = new students(7,"Samyak",23028,"gay");
        students s8 = new students(8,"Aaisma",23029,"female");

        students s9 = new students(1,"Ishan",23030,"male");
        students s10 = new students(1,"Prasoon",23031,"male");
        students s11 = new students(1,"Samrddhi",23032,"female");
        students s12 = new students(1,"Ojeshwi",23033,"female");

        ArrayList<students> groupA = new ArrayList<students>();
        groupA.add(s1);
        groupA.add(s2);
        groupA.add(s3);
        groupA.add(s4);
        ArrayList<students> groupB = new ArrayList<students>();
        groupA.add(s5);
        groupA.add(s6);
        groupA.add(s7);
        groupA.add(s8);
        ArrayList<students> groupC = new ArrayList<students>();
        groupA.add(s9);
        groupA.add(s10);
        groupA.add(s11);
        groupA.add(s12);


        group g1 = new group(groupA,"A");
        group g2 = new group(groupB,"B");
        group g3 = new group(groupC,"C");

        ArrayList<group> sec1 = new ArrayList<group>();
        sec1.add(g1);
        sec1.add(g2);
        sec1.add(g3);

        section lobuche = new section(sec1,"Lobuche");


    }
}
