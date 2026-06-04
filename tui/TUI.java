package tui;

import controller.CustomerController;
import controller.OrderController;
import model.Product;

import java.util.Scanner;

/**
 * Text-based user interface for Vestbjerg Byggecenter.
 * Covers UC01 through UC05:
 *   UC01 - Opret Ordre
 *   UC02 - Opret Kunde
 *   UC03 - Opdater Varepris og Rabat
 *   UC04 - Registrer Lagermodtagelse
 *   UC05 - Log Ind I Systemet
 *
 * @author IK
 * @version 1.0
 */
public class TUI {

    private Scanner scanner;
    private OrderController orderController;
    private CustomerController customerController;

    /**
     * Creates TUI and initialises controllers for UC01 and UC02.
     */
    public TUI() {
        scanner = new Scanner(System.in);
        orderController = new OrderController();
        customerController = new CustomerController();
    }

    /**
     * Starts the main menu loop.
     */
    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Vestbjerg Byggecenter ===");
            System.out.println("1. Opret ordre          (UC01)");
            System.out.println("2. Opret kunde          (UC02)");
            System.out.println("3. Opdater varepris     (UC03)");
            System.out.println("4. Registrer levering   (UC04)");
            System.out.println("5. Log ind              (UC05)");
            System.out.println("0. Afslut");
            System.out.print("Valg: ");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    createOrder();
                    break;
                case "2":
                    createCustomer();
                    break;
                case "3":
                    updatePrice();
                    break;
                case "4":
                    registerDelivery();
                    break;
                case "5":
                    login();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg - prøv igen.");
            }
        }
        System.out.println("Afslutter system.");
    }

    /**
     * UC01: Guides user through creating a new order.
     * Finds a customer by ID, adds products by name, then confirms the order.
     */
    private void createOrder() {
        orderController.createOrder();

        System.out.print("Indtast kunde-ID: ");
        int customerId = Integer.parseInt(scanner.nextLine().trim());
        orderController.findCustomer(customerId);

        boolean addingProducts = true;
        while (addingProducts) {
            System.out.print("Søg produkt (navn) eller skriv 'færdig': ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("færdig")) {
                addingProducts = false;
            } else {
                Product found = orderController.findProduct(name);
                if (found != null) {
                    System.out.println("Fundet: " + found.getName()
                            + " - " + found.getSellingPrice() + " kr.");
                    System.out.print("Antal: ");
                    int qty = Integer.parseInt(scanner.nextLine().trim());
                    orderController.addProduct(found, qty);
                    System.out.println("Tilføjet.");
                } else {
                    System.out.println("Produkt ikke fundet.");
                }
            }
        }

        orderController.confirmOrder();
        int orderId = orderController.getCurrentOrderId();
        System.out.println("Ordre oprettet med ID: " + orderId);
    }

    /**
     * UC02: Guides user through registering a new customer.
     * Collects name, phone, email, address and customer type.
     */
    private void createCustomer() {
        customerController.createCustomer();

        System.out.print("Navn: ");
        String name = scanner.nextLine().trim();
        System.out.print("Telefon: ");
        String phone = scanner.nextLine().trim();
        System.out.print("Email: ");
        String email = scanner.nextLine().trim();
        System.out.print("Adresse: ");
        String address = scanner.nextLine().trim();
        System.out.print("Type (privat/erhverv): ");
        String type = scanner.nextLine().trim();

        customerController.enterCustomerInfo(name, phone, email, address, type);
        int customerId = customerController.confirmCustomer();
        System.out.println("Kunde oprettet med ID: " + customerId);
    }

    /**
     * UC03: Not yet implemented.
     */
    private void updatePrice() {
        System.out.println("UC03 er ikke implementeret endnu.");
    }

    /**
     * UC04: Not yet implemented.
     */
    private void registerDelivery() {
        System.out.println("UC04 er ikke implementeret endnu.");
    }

    /**
     * UC05: Not yet implemented.
     */
    private void login() {
        System.out.println("UC05 er ikke implementeret endnu.");
    }

    /**
     * Main entry point.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        TUI tui = new TUI();
        tui.start();
    }
}

