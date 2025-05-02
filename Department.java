import java.util.*;

public class Department implements UniversityUnit {
    private String name;
    private List<UniversityUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addUnit(UniversityUnit unit) {
        units.add(unit);
    }

    @Override
    public void getDetails() {
        System.out.println("  Department: " + name);
        for (UniversityUnit unit : units) {
            unit.getDetails();
        }
    }

    @Override
    public int getStudentCount() {
        return units.stream().mapToInt(UniversityUnit::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return units.stream().mapToDouble(UniversityUnit::getBudget).sum();
    }
}
