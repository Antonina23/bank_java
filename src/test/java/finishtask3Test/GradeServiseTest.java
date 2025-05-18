package finishtask3Test;

import finishtask3.StudentGrade;
import finishtask3.InvalidGradeException;
import finishtask3.GradeService;

public class GradeServiseTest {
    public static void main(String[] args) {
        GradeService<Integer> gradeService = new GradeService<>();

        try {
            gradeService.addGrade(new StudentGrade<>("John", "Math", 5));
            gradeService.addGrade(new StudentGrade<>("Anna", "Math", 5));
            gradeService.addGrade(new StudentGrade<>("Bobby", "Math", 3));

            gradeService.addGrade(new StudentGrade<>("Carry", "Math", -5));
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Average Math grade is: " + gradeService.calculateAverageGrade("Math"));
    }
}
