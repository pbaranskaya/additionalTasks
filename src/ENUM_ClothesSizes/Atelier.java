package ENUM_ClothesSizes;

import Interface1.Printable;

public class Atelier {

    private Clothes[] allClothes;
    private int current;

    private void grow() {
        Clothes[] newAllClothes = new Clothes[allClothes.length * 2 + 1];
        System.arraycopy(allClothes, 0, newAllClothes,0, allClothes.length);
        allClothes = newAllClothes;
    }

    public void add(Clothes item) {
        if (allClothes == null) {
            allClothes = new Clothes[10];
            current = 0;
        }
        if (current >= allClothes.length) {
            grow();
        }
        allClothes[current++] = item;
    }
}
