import java.util.ArrayList;
import java.util.List;

class CandidateManager implements CandidateManagement {
    private List<Candidate> candidates;

    public CandidateManager() {
        candidates = new ArrayList<>();
    }

    @Override
    public void addCandidate(int enrollmentNumber, double grade) {
        Candidate candidate = new Candidate(enrollmentNumber, grade);
        candidates.add(candidate);
        System.out.println("Candidato adicionado com sucesso!");
    }

    @Override
    public void displayAllCandidates() {
        if (candidates.isEmpty()) {
            System.out.println("Nenhum candidato cadastrado.");
        } else {
            System.out.println("Candidatos cadastrados:");
            for (Candidate candidate : candidates) {
                System.out.println("Número de Matrícula: " + candidate.getEnrollmentNumber() + ", Nota: " + candidate.getGrade());
            }
        }
    }

    @Override
    public void deleteCandidate(int enrollmentNumber) {
        Candidate candidateToRemove = null;
        for (Candidate candidate : candidates) {
            if (candidate.getEnrollmentNumber() == enrollmentNumber) {
                candidateToRemove = candidate;
                break;
            }
        }

        if (candidateToRemove != null) {
            candidates.remove(candidateToRemove);
            System.out.println("Candidato removido com sucesso!");
        } else {
            System.out.println("Candidato não encontrado.");
        }
    }
}
