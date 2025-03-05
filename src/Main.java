import base.*;
import uni.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Asiye", "01");
        Person person2 = new Person("Elahe", "02");
        Person person3 = new Person("Amir", "03");
        Person person4 = new Person("Tavana", "04");
        Person person5 = new Person("Ghatei", "05");

        Major M1 = new Major("Math", 120);
        Major M2 = new Major("CS", 120);

        System.out.println("Students' Name:");
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);

        System.out.println("Student Code of Asiye , Elahe and Amir in Order:");
        Student S1 = new Student(1, 403, M1.id);
        Student S2 = new Student(2, 403, M1.id);
        Student S3 = new Student(3, 403, M2.id);

        Professor P1 = new Professor(4, M1.id);
        Professor P2 = new Professor(5, M2.id);

        Course C1 = new Course("Math", 3);
        Course C2 = new Course("Physic", 2);
        Course C3 = new Course("BP", 3);

        System.out.println("Professors' Name and Id:");
        System.out.println("Name:" + person4.name + "    Id:  " + P1.PersonID);
        System.out.println("Name:" + person5.name + "    Id:  " + P2.PersonID);

        PresentedCourse math = new PresentedCourse(C1.id, P1.id, 30);
        PresentedCourse physic = new PresentedCourse(C2.id, P1.id, 30);
        PresentedCourse bp = new PresentedCourse(C3.id, P2.id, 30);

        math.addStudent(1);
        math.addStudent(2);
        physic.addStudent(1);
        physic.addStudent(2);
        physic.addStudent(3);
        bp.addStudent(3);

        Transcript t1 = new Transcript(S1.id);
        Transcript t2 = new Transcript(S2.id);
        Transcript t3 = new Transcript(S3.id);

        t1.setGrade(math.id, 18.5);
        t1.setGrade(physic.id, 18.25);
        t2.setGrade(math.id, 17.75);
        t2.setGrade(physic.id, 17.0);
        t3.setGrade(physic.id, 16.0);
        t3.setGrade(bp.id, 19.0);

        System.out.println(person1.name + "'s Transcript");
        t1.printTranscript();
        System.out.println(person2.name + "'s Transcript");
        t2.printTranscript();
        System.out.println(person3.name + "'s Transcript");
        t3.printTranscript();

    }
}