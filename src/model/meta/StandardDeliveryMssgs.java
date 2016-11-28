package model.meta;

public interface StandardDeliveryMssgs {
    void accept(StandardDeliveryMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface StandardDeliveryDOWNMssgs extends CustomerDeliveryDOWNMssgs, StandardDeliveryMssgs{}
interface StandardDeliveryUPMssgs extends Mssgs, StandardDeliveryMssgs{}
