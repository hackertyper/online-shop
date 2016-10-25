package model.meta;

public interface CustomerServiceMssgsVisitor extends CustomerServiceDOWNMssgsVisitor, CustomerServiceUPMssgsVisitor {}


interface CustomerServiceDOWNMssgsVisitor extends ShopServiceDOWNMssgsVisitor, CartServiceDOWNMssgsVisitor, AccountServiceDOWNMssgsVisitor {

    
}


interface CustomerServiceUPMssgsVisitor extends ServiceUPMssgsVisitor {

    
}
