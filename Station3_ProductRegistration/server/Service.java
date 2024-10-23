import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Service extends Remote {

    void registerProduct(int productId, String productType) throws RemoteException;

    Products getProductById(int productId) throws RemoteException;

    List<ProductTrays> getAllProductTypes() throws RemoteException;

    void createOrder(int orderId, int productId) throws RemoteException;

    OrderProducts getOrderById(int orderId) throws RemoteException;

    void createDistributionOrder(int orderId, String customerDetails, String shippingDate) throws RemoteException;

    DistributionOrders getDistributionOrderById(int orderId) throws RemoteException;
}
