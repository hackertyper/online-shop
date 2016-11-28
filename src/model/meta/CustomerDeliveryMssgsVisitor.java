package model.meta;

public interface CustomerDeliveryMssgsVisitor extends CustomerDeliveryDOWNMssgsVisitor, CustomerDeliveryUPMssgsVisitor {}


interface CustomerDeliveryDOWNMssgsVisitor extends OverNightDeliveryDOWNMssgsVisitor, StandardDeliveryDOWNMssgsVisitor, TestDeliveryDOWNMssgsVisitor {

    
}


interface CustomerDeliveryUPMssgsVisitor  {

    
}
