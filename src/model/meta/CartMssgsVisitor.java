package model.meta;

public interface CartMssgsVisitor extends CartDOWNMssgsVisitor, CartUPMssgsVisitor {}


interface CartDOWNMssgsVisitor  {

    public void handleCartAddArticleQuantifiedArticlesMssg(CartAddArticleQuantifiedArticlesMssg event) throws persistence.PersistenceException;
    
}


interface CartUPMssgsVisitor  {

    public void handleCartAddArticleQuantifiedArticlesMssg(CartAddArticleQuantifiedArticlesMssg event) throws persistence.PersistenceException;
    
}
