package model.meta;

public interface ServiceMssgsVisitor extends ServiceDOWNMssgsVisitor, ServiceUPMssgsVisitor {}


interface ServiceDOWNMssgsVisitor extends CustomerServiceDOWNMssgsVisitor, RegisterServiceDOWNMssgsVisitor, ShopkeeperServiceDOWNMssgsVisitor {

    
}


interface ServiceUPMssgsVisitor  {

    
}
