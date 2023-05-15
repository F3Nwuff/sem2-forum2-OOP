public class Sales {
// each object contains details of one sale
    private String itemId;     // id of the item
    private double value;      // the price of one item
    private int quantity;      // the number of the items sold
// constructor missing
    Sales(String id, double val, int q) {
        this.itemId = id;
        this.value = val;
        this.quantity = q;
    }
    public double getValue() {return value;}
    public int getQuantity() {return quantity;}
    public String getItemID(){return itemId;}
}