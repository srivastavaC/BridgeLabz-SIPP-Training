import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRoleDescription();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    public String getRoleDescription() {
        return "Handles software development, coding, and debugging.";
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    public String getRoleDescription() {
        return "Works with data analysis, modeling, and AI algorithms.";
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    public String getRoleDescription() {
        return "Manages product lifecycle and team coordination.";
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
}

class ResumeScreeningSystem {
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing resume of: " + resume.getJobRole().getCandidateName());
        System.out.println("Role: " + resume.getJobRole().getClass().getSimpleName());
        System.out.println("Details: " + resume.getJobRole().getRoleDescription());
    }

    public static void batchScreen(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            System.out.println("Screening: " + candidate.getCandidateName() + " - " + candidate.getRoleDescription());
        }
    }
}

public class ResumeScreeningApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> resume1 = new Resume<>(new SoftwareEngineer("Anvesha"));
        Resume<DataScientist> resume2 = new Resume<>(new DataScientist("Bublu"));
        Resume<ProductManager> resume3 = new Resume<>(new ProductManager("Chandan"));

        ResumeScreeningSystem.processResume(resume1);
        ResumeScreeningSystem.processResume(resume2);
        ResumeScreeningSystem.processResume(resume3);

        List<JobRole> allCandidates = new ArrayList<>();
        allCandidates.add(resume1.getJobRole());
        allCandidates.add(resume2.getJobRole());
        allCandidates.add(resume3.getJobRole());

        ResumeScreeningSystem.batchScreen(allCandidates);
    }
}
