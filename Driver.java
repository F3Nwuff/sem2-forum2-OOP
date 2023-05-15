public class Driver {
    public static void main(String[] args){
        SalesPerson[] salesPeople = new SalesPerson[6];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());
    }
    public static String highest(SalesPerson[] salesPeople) {
        String index = salesPeople[0].getId();
        double maxSales = salesPeople[0].calcTotalSales();

        for (SalesPerson person : salesPeople) {
            if (person != null && person.calcTotalSales() > maxSales) {
                maxSales = person.calcTotalSales();
                index = person.getId();
            }
        }
        return index;
    }
    public static boolean addSales(Sales sale, String id, SalesPerson[] salesPeople) {
        for (SalesPerson person : salesPeople) {
            if (person != null && person.getId().equals(id)) {
                person.setSalesHistory(sale);
                return true;
            }
        }
        return false;
    }
}
