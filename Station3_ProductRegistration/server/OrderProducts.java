import java.io.Serializable;

public class OrderProducts implements Serializable
{
    private int orderId;
    private int productId;

    public OrderProducts(int orderId, int productId) {
        this.orderId = orderId;
        this.productId = productId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
