package model.meta;

public interface ArticleMssgsVisitor extends ArticleDOWNMssgsVisitor, ArticleUPMssgsVisitor {}


interface ArticleDOWNMssgsVisitor  {

    public void handleArticleReceiveDeliveryIntegerMssg(ArticleReceiveDeliveryIntegerMssg event) throws persistence.PersistenceException;
    
}


interface ArticleUPMssgsVisitor extends ItemUPMssgsVisitor {

    public void handleArticleReceiveDeliveryIntegerMssg(ArticleReceiveDeliveryIntegerMssg event) throws persistence.PersistenceException;
    
}
