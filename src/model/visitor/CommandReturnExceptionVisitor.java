
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,CustomerCommandReturnExceptionVisitor<R, E> ,ItemCommandReturnExceptionVisitor<R, E> ,NewlyAddedCommandReturnExceptionVisitor<R, E> {
    
    
}
