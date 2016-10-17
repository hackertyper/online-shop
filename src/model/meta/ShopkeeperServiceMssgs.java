package model.meta;

public interface ShopkeeperServiceMssgs {
    void accept(ShopkeeperServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopkeeperServiceDOWNMssgs extends ServiceDOWNMssgs, ShopkeeperServiceMssgs{}
interface ShopkeeperServiceUPMssgs extends Mssgs, ShopkeeperServiceMssgs{}
