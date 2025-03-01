package university;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudenName) {
        this.studentID = someStudentID;
        this.studentName = someStudenName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Университет: " + universityName + ", ID студента: " + this.studentID + ", студент: "+ this.studentName);
    }


}
