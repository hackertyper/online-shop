package model.meta;

public interface ShopkeeperMssgs {
    void accept(ShopkeeperMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopkeeperDOWNMssgs extends Mssgs, ShopkeeperMssgs{}
interface ShopkeeperUPMssgs extends Mssgs, ShopkeeperMssgs{}
