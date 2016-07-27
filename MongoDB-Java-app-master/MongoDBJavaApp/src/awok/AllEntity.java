package awok;

import java.util.ArrayList;
import java.util.List;

public class AllEntity {
/*	String _id;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}*/
	public List<UserOrders> getUserOrders() {
		return orders;
	}
	public void setUserOrders(List<UserOrders> userOrders) {
		this.orders = userOrders;
	}
	List<UserOrders> orders = new ArrayList<UserOrders>();
}
