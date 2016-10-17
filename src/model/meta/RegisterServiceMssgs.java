package model.meta;

public interface RegisterServiceMssgs {
    void accept(RegisterServiceMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface RegisterServiceDOWNMssgs extends ServiceDOWNMssgs, RegisterServiceMssgs{}
interface RegisterServiceUPMssgs extends Mssgs, RegisterServiceMssgs{}
