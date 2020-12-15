package domain;

import java.sql.Timestamp;

public class Order {

    private int orderNr;
    private int pizzaId;
    private int amount;
    private int pickuptime;
    private Timestamp ordertime;
    private String custemorName;
    private String phone;
    private boolean remove;

    public Order(int pizzaId, int amount) {
        this.pizzaId = pizzaId;
        this.amount = amount;
        remove = false;

    }
    public Order(int orderNr, int pizzaId, int amount, int pickuptime, Timestamp ordertime, String custemorName, String phone) {
        this.orderNr = orderNr;
        this.pizzaId = pizzaId;
        this.amount = amount;
        this.pickuptime = pickuptime;
        this.ordertime = ordertime;
        this.custemorName = custemorName;
        this.phone = phone;
    }

    public Order(int pizzaId, int amount, int pickuptime, String custemorName, String phone) {
        this.pizzaId = pizzaId;
        this.amount = amount;
        this.pickuptime = pickuptime;
        this.custemorName = custemorName;
        this.phone = phone;
    }

    public Order(int pizzaId, int amount, int pickuptime, Timestamp ordertime, String custemorName, String phone, boolean remove) {
        this.pizzaId = pizzaId;
        this.amount = amount;
        this.pickuptime = pickuptime;
        this.ordertime = ordertime;
        this.custemorName = custemorName;
        this.phone = phone;
        this.remove = remove;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(int pickuptime) {
        this.pickuptime = pickuptime;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public String getCustomerName() {
        return custemorName;
    }

    public void setCustomerName(String customerName) {
        this.custemorName = custemorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }


    @Override
    public String toString() {
        return  "orderNr= " + orderNr + "\n" +
                "pizzaId= " + pizzaId + "\n" +
                "amount= " + amount + "\n" +
                "pickuptime= " + pickuptime + "\n" +
                "ordertime= " + ordertime + "\n" +
                "customerName= " + custemorName + "\n" +
                "phone= " + phone + "\n";
    }

}
