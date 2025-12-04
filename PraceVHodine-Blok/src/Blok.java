public abstract class Blok {
    protected int x,y,z;
    protected int durability;
    protected String sound;
    protected boolean isInteractiond;
    protected String namoOfTexture;
    public Blok(int x, int y, int z, int durability, String sound, boolean isInteractiond, String namoOfTexture) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.durability = durability;
        this.sound = sound;
        this.isInteractiond = isInteractiond;
        this.namoOfTexture = namoOfTexture;
    }

}
