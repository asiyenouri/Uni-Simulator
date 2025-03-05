package uni;

import java.util.ArrayList;

public class Major {
    public int id;
    public static ArrayList<Major> majorList = new ArrayList<Major>();
    public String name;
    public final int capacity;
    public int numberOfStudents;

    public Major(String name , int capacity ) {
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = 0;
        this.id = majorList.size() + 1;
        majorList.add(this);

    }
    public static Major findById(int id) {

        for ( Major major : majorList ) {
            if ( major.id == id ) {
                return major;
            }
        }
        return null;

    }

    public void addStudent() {
        if ( numberOfStudents >= capacity ) {
            System.out.println("No Enough Space To Add Student!");
        } else {
            numberOfStudents++;
        }
    }

}



