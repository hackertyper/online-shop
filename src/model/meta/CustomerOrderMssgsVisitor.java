package model.meta;

public interface CustomerOrderMssgsVisitor extends CustomerOrderDOWNMssgsVisitor, CustomerOrderUPMssgsVisitor {}


interface CustomerOrderDOWNMssgsVisitor  {

    
}


interface CustomerOrderUPMssgsVisitor extends DeliveryUPMssgsVisitor {

    
}
