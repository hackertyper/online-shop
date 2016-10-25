package model.meta;

public interface ShopServiceMssgs {
    void accept(ShopServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopServiceDOWNMssgs extends CustomerServiceDOWNMssgs, ShopServiceMssgs{}
interface ShopServiceUPMssgs extends Mssgs, ShopServiceMssgs{}
