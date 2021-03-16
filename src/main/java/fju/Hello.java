package fju;

public class Hello {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();

        Student[] students = {
                new Student("1101", "Eric", 60, 80),
                new Student("1102", "Hank", 60, 80),
                new Student("1103", "Jane", 60, 80),
                new Student("1104", "Jack", 60, 80),
        };

        GraduateStudent graduateStudents = new GraduateStudent();

        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }
}
