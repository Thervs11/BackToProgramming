package OOP1;

public class InventoryManager {
    private String[] brands = new String[10];
    private int brandCount = 0;

    private SingleProduct[][] singles = new SingleProduct[10][100];
    private int[] singleCount = new int[10];

    private BoxedProduct[][] boxes = new BoxedProduct[10][100];
    private int[] boxCount = new int[10];

    private int findBrandIndex(String brand) { 
        for (int i = 0; i < brandCount; i++) {
            if (brands[i].equalsIgnoreCase(brand)) {
                return i;
            }
        }
        return -1;
    }

    private int getOrCreateBrand (String brand) {
        int index = findBrandIndex(brand);

        if (index == -1) {
            brands[brandCount] = brand;
            index = brandCount;
            brandCount++;
        }
        return index;
    }

    public void add(SingleProduct p) {
        add(p, 1);
    }

    public void add(SingleProduct p, int quantity) {
        int index = getOrCreateBrand(p.getBrand());

        for (int i = 0; i < quantity; i++) {
            singles[index][singleCount[index]] = p;
            singleCount[index]++;
        }
    }

    public void add(BoxedProduct p, int quantity) {
        int index = getOrCreateBrand(p.getBrand());

        for (int i = 0; i < quantity; i++) {
            boxes[index][boxCount[index]] = p;
            boxCount[index]++;
        }
    }

    public String[] getBrands() {
        String[] result = new String[brandCount];
        for (int i = 0; i < brandCount; i++) {
            result[i] = brands[i];
        }
        return result;
    }

    public BoxedProduct[] getBoxes(String brand) {
        int index = findBrandIndex(brand);

        if (index == -1) {
            return new BoxedProduct[0];
        }

        BoxedProduct[] result = new BoxedProduct[boxCount[index]];
        for (int i = 0; i < boxCount[index]; i++) {
            result[i] = boxes[index][i];
        }
        return result;
    }

    public SingleProduct[] getSingles(String brand) {
        int index = findBrandIndex(brand);

        if (index == -1) {
            return new SingleProduct[0];
        }

        SingleProduct[] result = new SingleProduct[singleCount[index]];
        for (int i = 0; i < singleCount[index]; i++) {
            result[i] = singles[index][i];
        }
        return result;
    }
}
