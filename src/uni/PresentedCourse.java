package uni;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<PresentedCourse>();
    public int CourseID;
    public int ProfessorID;
    public int capacity;
    public ArrayList<Integer> StudentIds;

    public PresentedCourse(int CourseID, int ProfessorID, int capacity) {
        this.CourseID = CourseID;
        this.ProfessorID = ProfessorID;
        this.capacity = capacity;
        this.StudentIds = new ArrayList<>();
        this.id = presentedCourseList.size() + 1;
        presentedCourseList.add(this);


    }
    public static PresentedCourse findById(int id) {
        for (PresentedCourse pCourse : presentedCourseList) {
            if (pCourse.id == id) {
                return pCourse;
            }
        }
        return null;
    }
    public void addStudent(int StudentId) {
        if (StudentIds.size() < capacity) {
            StudentIds.add(StudentId);
        }
        else {
            System.out.println("No Enough Space To Add Student");
        }
    }


}

