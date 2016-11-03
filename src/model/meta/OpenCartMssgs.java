package model.meta;

public interface OpenCartMssgs {
    void accept(OpenCartMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface OpenCartDOWNMssgs extends CartStateDOWNMssgs, OpenCartMssgs{}
interface OpenCartUPMssgs extends Mssgs, OpenCartMssgs{}
