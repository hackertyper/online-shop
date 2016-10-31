package model.meta;

public interface CartStateMssgsVisitor extends CartStateDOWNMssgsVisitor, CartStateUPMssgsVisitor {}


interface CartStateDOWNMssgsVisitor extends OpenCartDOWNMssgsVisitor, CheckedOutDOWNMssgsVisitor {

    
}


interface CartStateUPMssgsVisitor  {

    
}
