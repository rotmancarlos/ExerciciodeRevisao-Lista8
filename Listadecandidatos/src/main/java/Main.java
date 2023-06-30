import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidateManagement candidateManager = new CandidateManager();

        boolean running = true;
        while (running) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar candidato");
            System.out.println("2 - Exibir todos os candidatos");
            System.out.println("3 - Excluir candidato");
            System.out.println("4 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.println("Digite o número de matrícula do candidato:");
                    int enrollmentNumber = scanner.nextInt();
                    System.out.println("Digite a nota do candidato:");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    candidateManager.addCandidate(enrollmentNumber, grade);
                    break;
                case 2:
                    candidateManager.displayAllCandidates();
                    break;
                case 3:
                    System.out.println("Digite o número de matrícula do candidato a ser excluído:");
                    int candidateEnrollmentNumber = scanner.nextInt();
                    candidateManager.deleteCandidate(candidateEnrollmentNumber);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("Chegamos ao fim...Programa encerrado.");
    }
}
