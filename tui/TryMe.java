package tui;

import controller.CustomerController;
import controller.OrderController;
import model.Customer;
import model.Product;

/**
 * Demo runner for Vestbjerg Byggecenter system.
 * Creates 10 private and 10 business customers, places sample orders,
 * and prints a full overview to verify the system works correctly.
 *
 * @author
 * @version
 */
public class TryMe {

    /**
     * Runs the full demo.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        CustomerController cc = new CustomerController();
        OrderController oc = new OrderController();

        // ── Opret 10 private kunder ──────────────────────────────────
        System.out.println("=== Opretter private kunder ===");

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 1", "+45 11111111", "privat1@test.dk", "Testvej 1, 9000 Aalborg", "privat");
        int id1 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 1  ID=" + id1);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 2", "+45 11111112", "privat2@test.dk", "Testvej 2, 9000 Aalborg", "privat");
        int id2 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 2  ID=" + id2);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 3", "+45 11111113", "privat3@test.dk", "Testvej 3, 9000 Aalborg", "privat");
        int id3 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 3  ID=" + id3);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 4", "+45 11111114", "privat4@test.dk", "Testvej 4, 9000 Aalborg", "privat");
        int id4 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 4  ID=" + id4);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 5", "+45 11111115", "privat5@test.dk", "Testvej 5, 9000 Aalborg", "privat");
        int id5 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 5  ID=" + id5);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 6", "+45 11111116", "privat6@test.dk", "Testvej 6, 9000 Aalborg", "privat");
        int id6 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 6  ID=" + id6);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 7", "+45 11111117", "privat7@test.dk", "Testvej 7, 9000 Aalborg", "privat");
        int id7 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 7  ID=" + id7);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 8", "+45 11111118", "privat8@test.dk", "Testvej 8, 9000 Aalborg", "privat");
        int id8 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 8  ID=" + id8);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 9", "+45 11111119", "privat9@test.dk", "Testvej 9, 9000 Aalborg", "privat");
        int id9 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 9  ID=" + id9);

        cc.createCustomer();
        cc.enterCustomerInfo("Privat Kunde 10", "+45 11111110", "privat10@test.dk", "Testvej 10, 9000 Aalborg", "privat");
        int id10 = cc.confirmCustomer();
        System.out.println("Oprettet: Privat Kunde 10  ID=" + id10);

        // ── Opret 10 erhvervskunder ──────────────────────────────────
        System.out.println("\n=== Opretter erhvervskunder ===");

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 1", "+45 99999991", "firma1@test.dk", "Erhvervsvej 1, 9220 Aalborg Øst", "erhverv");
        int b1 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 1  ID=" + b1);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 2", "+45 99999992", "firma2@test.dk", "Erhvervsvej 2, 9220 Aalborg Øst", "erhverv");
        int b2 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 2  ID=" + b2);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 3", "+45 99999993", "firma3@test.dk", "Erhvervsvej 3, 9220 Aalborg Øst", "erhverv");
        int b3 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 3  ID=" + b3);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 4", "+45 99999994", "firma4@test.dk", "Erhvervsvej 4, 9220 Aalborg Øst", "erhverv");
        int b4 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 4  ID=" + b4);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 5", "+45 99999995", "firma5@test.dk", "Erhvervsvej 5, 9220 Aalborg Øst", "erhverv");
        int b5 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 5  ID=" + b5);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 6", "+45 99999996", "firma6@test.dk", "Erhvervsvej 6, 9220 Aalborg Øst", "erhverv");
        int b6 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 6  ID=" + b6);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 7", "+45 99999997", "firma7@test.dk", "Erhvervsvej 7, 9220 Aalborg Øst", "erhverv");
        int b7 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 7  ID=" + b7);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 8", "+45 99999998", "firma8@test.dk", "Erhvervsvej 8, 9220 Aalborg Øst", "erhverv");
        int b8 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 8  ID=" + b8);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 9", "+45 99999999", "firma9@test.dk", "Erhvervsvej 9, 9220 Aalborg Øst", "erhverv");
        int b9 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 9  ID=" + b9);

        cc.createCustomer();
        cc.enterCustomerInfo("Erhverv Firma 10", "+45 99999990", "firma10@test.dk", "Erhvervsvej 10, 9220 Aalborg Øst", "erhverv");
        int b10 = cc.confirmCustomer();
        System.out.println("Oprettet: Erhverv Firma 10  ID=" + b10);

        // ── Opret 3 sample ordrer ────────────────────────────────────
        System.out.println("\n=== Opretter sample ordrer ===");

        oc.createOrder();
        oc.findCustomer(id1);
        Product p1 = oc.findProduct("Mursten");
        if (p1 != null) oc.addProduct(p1, 200);
        Product p2 = oc.findProduct("Cement");
        if (p2 != null) oc.addProduct(p2, 5);
        oc.confirmOrder();
        int o1 = oc.getCurrentOrderId();
        System.out.println("Ordre oprettet  ID=" + o1 + "  (kunde: Privat Kunde 1)");

        oc.createOrder();
        oc.findCustomer(b1);
        Product p3 = oc.findProduct("Gips");
        if (p3 != null) oc.addProduct(p3, 50);
        Product p4 = oc.findProduct("Isolering");
        if (p4 != null) oc.addProduct(p4, 20);
        oc.confirmOrder();
        int o2 = oc.getCurrentOrderId();
        System.out.println("Ordre oprettet  ID=" + o2 + "  (kunde: Erhverv Firma 1)");

        oc.createOrder();
        oc.findCustomer(b3);
        Product p5 = oc.findProduct("Træskrue");
        if (p5 != null) oc.addProduct(p5, 10);
        oc.confirmOrder();
        int o3 = oc.getCurrentOrderId();
        System.out.println("Ordre oprettet  ID=" + o3 + "  (kunde: Erhverv Firma 3)");

        // ── Kundesøgning test ────────────────────────────────────────
        System.out.println("\n=== Kundesøgning test ===");
        Customer found = cc.findCustomer(b2);
        if (found != null) {
            System.out.println("Fundet: " + found.getName() + " (" + found.getType() + ")  tlf: " + found.getPhone());
        }

        Customer notFound = cc.findCustomer(9999);
        if (notFound == null) {
            System.out.println("Kunde ID 9999: ikke fundet (korrekt)");
        }

        System.out.println("\n=== Demo færdig ===");
    }
}
