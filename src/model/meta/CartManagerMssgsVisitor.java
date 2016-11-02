package model.meta;

public interface CartManagerMssgsVisitor extends CartManagerDOWNMssgsVisitor, CartManagerUPMssgsVisitor {}


interface CartManagerDOWNMssgsVisitor  {

    public void handleCartManagerAddArticleArticleIntegerMssg(CartManagerAddArticleArticleIntegerMssg event) throws persistence.PersistenceException;
    
}


interface CartManagerUPMssgsVisitor  {

    public void handleCartManagerAddArticleArticleIntegerMssg(CartManagerAddArticleArticleIntegerMssg event) throws persistence.PersistenceException;
    
}
