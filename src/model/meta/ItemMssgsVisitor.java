package model.meta;

public interface ItemMssgsVisitor extends ItemDOWNMssgsVisitor, ItemUPMssgsVisitor {}


interface ItemDOWNMssgsVisitor extends ProductGroupDOWNMssgsVisitor, ArticleDOWNMssgsVisitor {

    
}


interface ItemUPMssgsVisitor  {

    
}
