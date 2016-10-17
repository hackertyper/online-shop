package model.meta;

public interface SendOrderMssgsVisitor extends SendOrderDOWNMssgsVisitor, SendOrderUPMssgsVisitor {}


interface SendOrderDOWNMssgsVisitor  {

    
}


interface SendOrderUPMssgsVisitor extends CustomerOrderStateUPMssgsVisitor {

    
}
