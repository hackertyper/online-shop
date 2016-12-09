package model.meta;

public interface CustomerPresetsMssgs {
    void accept(CustomerPresetsMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface CustomerPresetsDOWNMssgs extends Mssgs, CustomerPresetsMssgs{}
interface CustomerPresetsUPMssgs extends Mssgs, CustomerPresetsMssgs{}
