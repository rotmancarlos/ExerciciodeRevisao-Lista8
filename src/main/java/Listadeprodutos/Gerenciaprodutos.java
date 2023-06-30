package Listadeprodutos;

import java.util.ArrayList;
import java.util.List;

class ProductManager implements ProductManagement {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Produto adicionado com sucesso!");
    }

    @Override
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Produtos cadastrados:");
            for (Product product : products) {
                System.out.println("Nome: " + product.getName() + ", Preço: " + product.getPrice());
            }
        }
    }

    @Override
    public void deleteProduct(String name) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                productToRemove = product;
                break;
            }
        }

        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
