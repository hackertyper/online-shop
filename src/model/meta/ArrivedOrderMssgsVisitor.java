package model.meta;

public interface ArrivedOrderMssgsVisitor extends ArrivedOrderDOWNMssgsVisitor, ArrivedOrderUPMssgsVisitor {}


interface ArrivedOrderDOWNMssgsVisitor  {

    
}


interface ArrivedOrderUPMssgsVisitor extends CustomerOrderStateUPMssgsVisitor {

    
}
