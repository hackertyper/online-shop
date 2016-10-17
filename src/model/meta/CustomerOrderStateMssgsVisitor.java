package model.meta;

public interface CustomerOrderStateMssgsVisitor extends CustomerOrderStateDOWNMssgsVisitor, CustomerOrderStateUPMssgsVisitor {}


interface CustomerOrderStateDOWNMssgsVisitor extends SendOrderDOWNMssgsVisitor, ArrivedOrderDOWNMssgsVisitor {

    
}


interface CustomerOrderStateUPMssgsVisitor  {

    
}
