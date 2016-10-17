package model.meta;

public interface ArrivedOrderMssgs {
    void accept(ArrivedOrderMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ArrivedOrderDOWNMssgs extends CustomerOrderStateDOWNMssgs, ArrivedOrderMssgs{}
interface ArrivedOrderUPMssgs extends Mssgs, ArrivedOrderMssgs{}
