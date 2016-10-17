package model.meta;

public interface OfferedFSaleMssgs {
    void accept(OfferedFSaleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OfferedFSaleDOWNMssgs extends ArticleStateDOWNMssgs, OfferedFSaleMssgs{}
interface OfferedFSaleUPMssgs extends Mssgs, OfferedFSaleMssgs{}
