public class Main {
    public static void main(String[] args) {
        College university = new College("New Era University");

        College engineering = new College("College of Engineering");
        Department compSci = new Department("Department of Computer Science");

        Teacher t1 = new Teacher("Prof. Reyes", "Java Programming", 50000);
        Student s1 = new Student("Lyrine Poliarco", "2023-0001", 20000);
        Student s2 = new Student("Mark Dela Cruz", "2023-0002", 20000);

        compSci.addUnit(t1);
        compSci.addUnit(s1);
        compSci.addUnit(s2);

        engineering.addUnit(compSci);

        university.addUnit(engineering);

        System.out.println("=== University Details ===");
        university.getDetails();

        System.out.println("\nTotal Students: " + university.getStudentCount());
        System.out.println("Total Budget: " + university.getBudget());
    }
}
