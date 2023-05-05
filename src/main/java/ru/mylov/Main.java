package ru.mylov;
import ru.comparators.StudentComparator;
import ru.comparators.UniversityComparator;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities =
                ExcelReader.getExcelReader().readUniversities();
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEAR);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                ExcelReader.getExcelReader().readStudents();
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}