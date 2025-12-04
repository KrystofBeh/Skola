public class GrassBlock extends Blok implements NonInteractBlok {

    public GrassBlock(int x, int y, int z, int durability, String sound, boolean isInteractiond, String namoOfTexture) {
        super(x, y, z, durability, sound, isInteractiond, namoOfTexture);
    }

    public void makeSound() {
        System.out.println("GroundSound");
    }




}
