package model.meta;

public interface CustomerDeliveryMssgsVisitor extends CustomerDeliveryDOWNMssgsVisitor, CustomerDeliveryUPMssgsVisitor {}


interface CustomerDeliveryDOWNMssgsVisitor extends OverNightDeliveryDOWNMssgsVisitor, StandardDeliveryDOWNMssgsVisitor, TestDeliveryDOWNMssgsVisitor {

    public void handleCustomerDeliveryChangeExtraChargeIntegerMssg(CustomerDeliveryChangeExtraChargeIntegerMssg event) throws persistence.PersistenceException;
    public void handleCustomerDeliveryChangeTimeIntegerMssg(CustomerDeliveryChangeTimeIntegerMssg event) throws persistence.PersistenceException;
    
}


interface CustomerDeliveryUPMssgsVisitor  {

    public void handleCustomerDeliveryChangeExtraChargeIntegerMssg(CustomerDeliveryChangeExtraChargeIntegerMssg event) throws persistence.PersistenceException;
    public void handleCustomerDeliveryChangeTimeIntegerMssg(CustomerDeliveryChangeTimeIntegerMssg event) throws persistence.PersistenceException;
    
}
