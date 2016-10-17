
package model.visitor;

import persistence.*;

public interface RemoteReturnExceptionVisitor<R, E extends model.UserException> extends ServiceReturnExceptionVisitor<R, E> {
    
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    
}
