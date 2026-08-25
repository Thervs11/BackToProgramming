package Encapsulation;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        InventoryManager manager = new InventoryManager();
        int option = 0;

        while (option != 3) {
            System.out.print("\\nOptions:\\n\\t[1] Add Single Product\\n\\t[2] Add Box Product\\n\\t[3] Exit\\nChoice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    System.out.print("Brand: ");
                    String singleBrand = scanner.nextLine();

                    System.out.print("Quantity: ");
                    int singleQty = scanner.nextInt();
                    scanner.nextLine();

                    manager.add(new SingleProduct(singleBrand), singleQty);
                    break;
                case 2:
                    System.out.print("Brand: ");
                    String boxBrand = scanner.nextLine();

                    System.out.print("Items in Box: ");
                    int itemsInbox = scanner.nextInt();

                    System.out.print("Items in Box: ");
                    int boxQty = scanner.nextInt();
                    scanner.nextLine();

                    manager.add(new BoxedProduct(boxBrand, itemsInbox), boxQty);
                    break;
                case 3:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid input try again.");
                    break;
            }
        }
        String[] brands = manager.getBrands();

        for (String b : brands) {
            SingleProduct[] singles = manager.getSingles(b);
            BoxedProduct[] boxes = manager.getBoxes(b);

            int totalSingles = singles.length;
            int totalBoxes = boxes.length;

            int totalPieces = totalSingles;

            for (BoxedProduct box : boxes) {
                totalPieces += box.getQuantity();
            }
            System.out.println(b);
            System.out.println("\tSingles: " + totalSingles);
            System.out.println("\tBoxes: " + totalBoxes);
            System.out.println("\tTotal Pieces: " + totalPieces + "\n");
        }
    }
}
