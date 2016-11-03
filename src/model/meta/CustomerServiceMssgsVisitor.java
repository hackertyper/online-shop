package model.meta;

public interface CustomerServiceMssgsVisitor extends CustomerServiceDOWNMssgsVisitor, CustomerServiceUPMssgsVisitor {}


interface CustomerServiceDOWNMssgsVisitor extends ShopServiceDOWNMssgsVisitor, CartServiceDOWNMssgsVisitor, OrderServiceDOWNMssgsVisitor, AccountServiceDOWNMssgsVisitor {

    
}


interface CustomerServiceUPMssgsVisitor extends ServiceUPMssgsVisitor {

    
}
