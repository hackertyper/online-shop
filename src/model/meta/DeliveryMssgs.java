package model.meta;

public interface DeliveryMssgs {
    void accept(DeliveryMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface DeliveryDOWNMssgs extends Mssgs, DeliveryMssgs{}
interface DeliveryUPMssgs extends CustomerOrderUPMssgs, ShopKeeperOrderUPMssgs, RetoureUPMssgs, DeliveryMssgs{}
