package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class ServiceImpl extends UnicastRemoteObject implements ProductRegistrationRMI {

    protected ServiceImpl() throws RemoteException {

    }

    @Override
    public void registerProduct(int productId, String productType) throws RemoteException {

    }

    @Override
    public Products getProductById(int productId) throws RemoteException {
        return null;
    }

    @Override
    public List<ProductTrays> getAllProductTrays() throws RemoteException {
        return List.of();
    }

    @Override
    public List<ProductTrays> getAllProductTypes() throws RemoteException {
        return List.of();
    }


    @Override
    public void createOrder(int orderId, int productId) throws RemoteException {

    }

    @Override
    public OrderProducts getOrderById(int orderId) throws RemoteException {
        return null;
    }

    @Override
    public void createDistributionOrder(int orderId, String customerDetails, String shippingDate) throws RemoteException {

    }

    @Override
    public DistributionOrders getDistributionOrderById(int orderId) throws RemoteException {
        return null;
    }
}
