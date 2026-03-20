public class Diamond {
    public int id;
    public String carat;
    public String cut;
    public String color;
    public String clarity;
    public double depth;
    public double table;
    public int price;
    public double x, y, z;

    public Diamond(String id, String carat, String cut, String color, String clarity, String depth, String table, String price, String x, String y, String z) {
        this.id = Integer.parseInt(id);
        this.carat = carat;
        this.cut = cut;
        this.color = color;
        this.clarity = clarity;
        this.depth = Double.parseDouble(depth);
        this.table = Double.parseDouble(table);
        this.price = Integer.parseInt(price);
        this.x = Double.parseDouble(x);
        this.y = Double.parseDouble(y);
        this.z = Double.parseDouble(z);
    }
}
