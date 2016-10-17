package model.meta;

public interface QuantifiedArticlesMssgs {
    void accept(QuantifiedArticlesMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface QuantifiedArticlesDOWNMssgs extends Mssgs, QuantifiedArticlesMssgs{}
interface QuantifiedArticlesUPMssgs extends Mssgs, QuantifiedArticlesMssgs{}
