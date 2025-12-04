public class Chest extends Blok implements BlokInterface {


    public Chest(int x, int y, int z, int durability, String sound, boolean isInteractiond, String namoOfTexture) {
        super(x, y, z, durability, sound, isInteractiond, namoOfTexture);
    }

    public void makeSound() {
        System.out.println("ChestSound");
    }

    public void interactMakeSound() {
        System.out.println("ChestOpenSound");
    }

    public void  interact() {
        System.out.println("ChestOpen");
    }



}
