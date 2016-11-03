
package model.visitor;

public interface CommandReturnExceptionVisitor<R, E extends model.UserException> extends ArticleCommandReturnExceptionVisitor<R, E> ,CartManagerCommandReturnExceptionVisitor<R, E> ,CustomerManagerCommandReturnExceptionVisitor<R, E> ,ItemCommandReturnExceptionVisitor<R, E> ,NewlyAddedCommandReturnExceptionVisitor<R, E> ,OrderManagerCommandReturnExceptionVisitor<R, E> {
    
    
}
