
package model.visitor;

public interface CommandExceptionVisitor<E extends model.UserException> extends ArticleCommandExceptionVisitor<E>,CustomerCommandExceptionVisitor<E>,ItemCommandExceptionVisitor<E>,NewlyAddedCommandExceptionVisitor<E>{
    
    
}
