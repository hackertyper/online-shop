package model.meta;

public interface CustomerDeliveryMssgs {
    void accept(CustomerDeliveryMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerDeliveryDOWNMssgs extends Mssgs, CustomerDeliveryMssgs{}
interface CustomerDeliveryUPMssgs extends OverNightDeliveryUPMssgs, StandardDeliveryUPMssgs, TestDeliveryUPMssgs, CustomerDeliveryMssgs{}
