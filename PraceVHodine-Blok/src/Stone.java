public class Stone extends Blok implements NonInteractBlok{

    public Stone(int x, int y, int z, int durability, String sound, boolean isInteractiond, String namoOfTexture) {
        super(x, y, z, durability, sound, isInteractiond, namoOfTexture);
    }

    @Override
    public void makeSound() {
        System.out.println("StoneSound");
    }
}
