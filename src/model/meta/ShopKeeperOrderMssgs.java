package model.meta;

public interface ShopKeeperOrderMssgs {
    void accept(ShopKeeperOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ShopKeeperOrderDOWNMssgs extends DeliveryDOWNMssgs, ShopKeeperOrderMssgs{}
interface ShopKeeperOrderUPMssgs extends Mssgs, ShopKeeperOrderMssgs{}
