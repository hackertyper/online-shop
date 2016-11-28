package model.meta;

public interface OverNightDeliveryMssgs {
    void accept(OverNightDeliveryMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OverNightDeliveryDOWNMssgs extends CustomerDeliveryDOWNMssgs, OverNightDeliveryMssgs{}
interface OverNightDeliveryUPMssgs extends Mssgs, OverNightDeliveryMssgs{}
