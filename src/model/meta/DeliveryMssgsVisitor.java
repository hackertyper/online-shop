package model.meta;

public interface DeliveryMssgsVisitor extends DeliveryDOWNMssgsVisitor, DeliveryUPMssgsVisitor {}


interface DeliveryDOWNMssgsVisitor extends CustomerOrderDOWNMssgsVisitor, ShopKeeperOrderDOWNMssgsVisitor, RetoureDOWNMssgsVisitor {

    
}


interface DeliveryUPMssgsVisitor  {

    
}
