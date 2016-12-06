package model.meta;

public interface CustomerOrderStateMssgsVisitor extends CustomerOrderStateDOWNMssgsVisitor, CustomerOrderStateUPMssgsVisitor {}


interface CustomerOrderStateDOWNMssgsVisitor extends ArrivedOrderDOWNMssgsVisitor, SendOrderDOWNMssgsVisitor {

    
}


interface CustomerOrderStateUPMssgsVisitor  {

    
}
