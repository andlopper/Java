package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double total = 0;
        for (OrderItem o : items) {
            total += o.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order moment: " + sdf.format(moment) + "\nOrder status: " + status + "\nClient: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) +") - " +
                client.getEmail() + "\nOrdem items:\n" + items + "\nTotal price: $" + total();
    }
}
