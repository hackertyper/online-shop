package model.meta;

public interface OrderServiceMssgs {
    void accept(OrderServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OrderServiceDOWNMssgs extends CustomerServiceDOWNMssgs, OrderServiceMssgs{}
interface OrderServiceUPMssgs extends Mssgs, OrderServiceMssgs{}
