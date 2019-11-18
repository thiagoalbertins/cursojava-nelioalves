package exerciciocomposicao118;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double total = 0.0;
		for (int i = 0; i < items.size(); i++) {
			total = total + items.get(i).subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(sdf2.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append(
				"\nClient: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
		sb.append("\nOrder items: \n");
		Double p = 0.0;
		for (int i = 0; i < items.size(); i++) {
			sb.append(items.get(i).getProduct().getName() + ", $" + items.get(i).getProduct().getPrice() + ", Quantity: " + items.get(i).getQuantity() + ", Subtotal: $" + items.get(i).subTotal() + "\n");
			p = p + items.get(i).subTotal();
		}
		sb.append("Total price: $");
		sb.append(p);
		return sb.toString();
	}

}
