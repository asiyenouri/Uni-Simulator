package uni;
import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }
    public void setGrade(int PresentedCourseID , double grade) {
        transcript.put(PresentedCourseID, grade);
    }
    public void printTranscript() {
        for (HashMap.Entry<Integer, Double> entry : transcript.entrySet()) {
            int presentedCourseID = entry.getKey();
            double grade = entry.getValue();
            PresentedCourse presentedCourse = PresentedCourse.findById(presentedCourseID);
            if (presentedCourse != null) {
                Course course = Course.findByID(presentedCourse.CourseID);
                if (course != null) {
                    System.out.println("Course Title : " + course.title + "  Grade : " + grade);
                }
                else {
                    System.out.println("Course" + presentedCourse.CourseID + "not found.");
                }
            }
            else {
                System.out.println("presented course" + presentedCourseID + "not found.");
            }
        }
        System.out.println("Average : " + getGPA());
    }

    public double getGPA() {
        if(transcript.isEmpty()) {
            return 0.0;
        }
        else {
            double sum = 0.0;
            int unitSum = 0;
            for (Integer id : transcript.keySet()) {
                Course course = Course.findByID(id);
                sum += transcript.get(id) * course.units;
                unitSum += course.units;
            }
            return sum / unitSum;
        }
    }
}


