package finishtask3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> grades;

    public GradeService() {
        this.grades = new ArrayList<>();
    }

    public synchronized void addGrade(StudentGrade<T> grade) {
        if(grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Grade can`t be less than 0");
        }
        grades.add(grade);
    }

    public double calculateAverageGrade(String subject) {
        return grades.stream()
                .filter(g -> g.getSubject().equals(subject))
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElse(0.0);
    }
}
