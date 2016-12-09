package model.meta;

public interface TestDeliveryMssgs {
    void accept(TestDeliveryMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface TestDeliveryDOWNMssgs extends CustomerDeliveryDOWNMssgs, TestDeliveryMssgs{}
interface TestDeliveryUPMssgs extends Mssgs, TestDeliveryMssgs{}
