package model.meta;

public interface OrderServiceMssgsVisitor extends OrderServiceDOWNMssgsVisitor, OrderServiceUPMssgsVisitor {}


interface OrderServiceDOWNMssgsVisitor  {

    
}


interface OrderServiceUPMssgsVisitor extends CustomerServiceUPMssgsVisitor {

    
}
