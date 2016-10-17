
package model.visitor;

import persistence.*;

public interface InvokerReturnExceptionVisitor<R, E extends model.UserException> extends ServiceReturnExceptionVisitor<R, E> {
    
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    
}
