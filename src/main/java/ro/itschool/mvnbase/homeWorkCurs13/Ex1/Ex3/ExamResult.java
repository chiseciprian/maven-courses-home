package ro.itschool.mvnbase.homeWorkCurs13.Ex1.Ex3;

public class ExamResult {
    private final String name;
    private final String status;

    public ExamResult(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
