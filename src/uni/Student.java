package uni;

import base.Person;

import java.util.ArrayList;

public class Student {
    public int id;
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public int PersonID;
    public final int enteranceYear;
    public int majorID;
    public String studentID;

    public Student(int personID, int enteranceYear, int majorID) {
        this.PersonID = personID;
        this.enteranceYear = enteranceYear;
        this.majorID = majorID;
        this.id = studentList.size() + 1;
        this.studentID = String.format("%04d", this.id);
        studentList.add(this);

        Major major = Major.findById(majorID);
        if(major != null) {
            major.addStudent();
        }
        else {
            System.out.println("No major found");
        }
        setStudentCode();
    }

    public static Student findByID(int id) {
        for (Student student : studentList) {
            if (student.id == id) {
                return student;
            }
        }
        return null;

    }

    public void setStudentCode() {
        Major major = Major.findById(this.majorID);
        if (major != null) {
            System.out.println(enteranceYear + "0" + major.id + "0" + major.numberOfStudents);
        }
        else {
            System.out.println("Major ID is not valid");
        }
    }
}


