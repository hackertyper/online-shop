package model.meta;

public interface ManufacturerMssgs {
    void accept(ManufacturerMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface ManufacturerDOWNMssgs extends Mssgs, ManufacturerMssgs{}
interface ManufacturerUPMssgs extends Mssgs, ManufacturerMssgs{}
