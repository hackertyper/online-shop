package model.meta;

public interface CustomerOrderStateMssgsVisitor extends CustomerOrderStateDOWNMssgsVisitor, CustomerOrderStateUPMssgsVisitor {}


interface CustomerOrderStateDOWNMssgsVisitor extends PreOrderDOWNMssgsVisitor, ArrivedOrderDOWNMssgsVisitor, SendOrderDOWNMssgsVisitor {

    
}


interface CustomerOrderStateUPMssgsVisitor  {

    
}
