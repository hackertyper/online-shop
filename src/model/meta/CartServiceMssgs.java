package model.meta;

public interface CartServiceMssgs {
    void accept(CartServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CartServiceDOWNMssgs extends CustomerServiceDOWNMssgs, CartServiceMssgs{}
interface CartServiceUPMssgs extends Mssgs, CartServiceMssgs{}
