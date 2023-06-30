package Listadeprodutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManager = new ProductManager();

        boolean running = true;
        while (running) {
            System.out.println(" A seguir, selecione uma opção:");
            System.out.println("1 - Por favor, adicione um produto");
            System.out.println("2 - Exibir todos os produtos");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String name = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    productManager.addProduct(name, price);
                    break;
                case 2:
                    productManager.displayAllProducts();
                    break;
                case 3:
                    System.out.println("Digite o nome do produto a ser excluído:");
                    String productName = scanner.nextLine();
                    productManager.deleteProduct(productName);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("Chegamos ao fim. Programa encerrado.");
    }
}
