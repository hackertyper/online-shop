package model.meta;

public interface AccountServiceMssgs {
    void accept(AccountServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface AccountServiceDOWNMssgs extends CustomerServiceDOWNMssgs, AccountServiceMssgs{}
interface AccountServiceUPMssgs extends Mssgs, AccountServiceMssgs{}
