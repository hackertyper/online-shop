package model.meta;

public interface ShopManagerMssgs {
    void accept(ShopManagerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopManagerDOWNMssgs extends Mssgs, ShopManagerMssgs{}
interface ShopManagerUPMssgs extends Mssgs, ShopManagerMssgs{}
