package model.meta;

public interface PreOrderMssgs {
    void accept(PreOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface PreOrderDOWNMssgs extends CustomerOrderStateDOWNMssgs, PreOrderMssgs{}
interface PreOrderUPMssgs extends Mssgs, PreOrderMssgs{}
