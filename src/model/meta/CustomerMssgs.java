package model.meta;

public interface CustomerMssgs {
    void accept(CustomerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerDOWNMssgs extends Mssgs, CustomerMssgs{}
interface CustomerUPMssgs extends Mssgs, CustomerMssgs{}
