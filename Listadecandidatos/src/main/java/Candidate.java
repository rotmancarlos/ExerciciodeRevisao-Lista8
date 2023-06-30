
interface CandidateManagement {
    void addCandidate(int enrollmentNumber, double grade);
    void displayAllCandidates();
    void deleteCandidate(int enrollmentNumber);
}
public class Candidate {
    private int enrollmentNumber;
    private double grade;

    public Candidate(int enrollmentNumber, double grade) {
        this.enrollmentNumber = enrollmentNumber;
        this.grade = grade;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public double getGrade() {
        return grade;
    }
}
