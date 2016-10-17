package model.meta;

public interface RemovedFSaleMssgs {
    void accept(RemovedFSaleMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface RemovedFSaleDOWNMssgs extends ArticleStateDOWNMssgs, RemovedFSaleMssgs{}
interface RemovedFSaleUPMssgs extends Mssgs, RemovedFSaleMssgs{}
