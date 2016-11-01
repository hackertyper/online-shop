package model.meta;

public interface CustomerServiceMssgs {
    void accept(CustomerServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerServiceDOWNMssgs extends ServiceDOWNMssgs, CustomerServiceMssgs{}
interface CustomerServiceUPMssgs extends ShopServiceUPMssgs, CartServiceUPMssgs, OrderServiceUPMssgs, AccountServiceUPMssgs, CustomerServiceMssgs{}
