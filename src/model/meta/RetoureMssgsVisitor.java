package model.meta;

public interface RetoureMssgsVisitor extends RetoureDOWNMssgsVisitor, RetoureUPMssgsVisitor {}


interface RetoureDOWNMssgsVisitor  {

    
}


interface RetoureUPMssgsVisitor extends DeliveryUPMssgsVisitor {

    
}
