package ENUM_ClothesSizes;

import Interface1.Magazine;
import Interface1.Printable;

public class Atelier implements MensClothing, WomensClothing{

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

    @Override
    public void dressMan() {
        System.out.println("Мужская одежда: ");
        for (int i = 0; i < current; i++) {
            if (allClothes[i] instanceof Pants) {
                System.out.println(((Pants) allClothes[i]));
            } if (allClothes[i] instanceof Tie) {
                System.out.println(((Tie) allClothes[i]));
            } if (allClothes[i] instanceof TShirt) {
                System.out.println(((TShirt) allClothes[i]));
            }
        }
        System.out.println();
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская одежда: ");
        for (int i = 0; i < current; i++) {
            if (allClothes[i] instanceof Pants) {
                System.out.println(((Pants) allClothes[i]));
            } if (allClothes[i] instanceof Skirt) {
                System.out.println(((Skirt) allClothes[i]));
            } if (allClothes[i] instanceof TShirt) {
                System.out.println(((TShirt) allClothes[i]));
            }
        }
        System.out.println();
    }

}
