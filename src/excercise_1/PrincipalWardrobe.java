package excercise_1;

public class PrincipalWardrobe {
    public static void main(String[] args) {
        Wardrobe blouse = Wardrobe.BLOUSE;
        Wardrobe jean = Wardrobe.JEAN;
        Wardrobe tshirt = Wardrobe.TSHIRT;
        Wardrobe shirt = Wardrobe.SHIRT;

        System.out.println(blouse);
        System.out.println("Name: "+blouse.name);
        System.out.println("Description: "+blouse.description);
        System.out.println("Number of shelf: "+blouse.numShelf);
        System.out.println("Care and recommendations: "+blouse.showGarmentDescription());

        System.out.println(jean);
        System.out.println("Name: "+jean.name);
        System.out.println("Description: "+jean.description);
        System.out.println("Number of shelf: "+jean.numShelf);
        System.out.println("Care and recommendations: "+jean.showGarmentDescription());

        System.out.println(tshirt);
        System.out.println("Name: "+tshirt.name);
        System.out.println("Description: "+tshirt.description);
        System.out.println("Number of shelf: "+tshirt.numShelf);
        System.out.println("Care and recommendations: "+tshirt.showGarmentDescription());

        System.out.println(shirt);
        System.out.println("Name: "+shirt.name);
        System.out.println("Description: "+shirt.description);
        System.out.println("Number of shelf: "+shirt.numShelf);
        System.out.println("Care and recommendations: "+shirt.showGarmentDescription());

    }
}
