public class Student implements UniversityUnit {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void getDetails() {
        System.out.println("    Student: " + name + ", ID: " + studentID + ", Tuition: " + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }
}
