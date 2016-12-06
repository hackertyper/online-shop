package model.meta;

public interface QuantifiedArticlesMssgsVisitor extends QuantifiedArticlesDOWNMssgsVisitor, QuantifiedArticlesUPMssgsVisitor {}


interface QuantifiedArticlesDOWNMssgsVisitor  {

    public void handleQuantifiedArticlesFireArticleChangedArticleMssgsMssg(QuantifiedArticlesFireArticleChangedArticleMssgsMssg event) throws persistence.PersistenceException;
    public void handleQuantifiedArticlesRetoureIntegerMssg(QuantifiedArticlesRetoureIntegerMssg event) throws persistence.PersistenceException;
    
}


interface QuantifiedArticlesUPMssgsVisitor  {

    public void handleQuantifiedArticlesFireArticleChangedArticleMssgsMssg(QuantifiedArticlesFireArticleChangedArticleMssgsMssg event) throws persistence.PersistenceException;
    public void handleQuantifiedArticlesRetoureIntegerMssg(QuantifiedArticlesRetoureIntegerMssg event) throws persistence.PersistenceException;
    
}
