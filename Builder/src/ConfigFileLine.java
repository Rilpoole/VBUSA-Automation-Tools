public class ConfigFileLine {

    ConfigFileLine(
            String item,
            String description,
            int qty,
            double price,
            String tax) {
        this.item = item;
        this.description = description;
        this.qty = qty;
        this.price = price;
        this.tax = tax;
    }

    public String getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public String getTax() {
        return tax;
    }

    private String item = "";
    private String description = "";
    private int qty = 0;
    private double price = 0.00;
    private String tax = "";
}
