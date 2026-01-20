package Comparator_And_CustomComparable;

class Order {
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    public Order(int orderId, String customerName, double orderAmount,
                 int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount
				+ ", itemCount=" + itemCount + ", orderTime=" + orderTime + "]";
	}
}
