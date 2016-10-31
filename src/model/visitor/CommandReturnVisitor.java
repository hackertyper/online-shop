
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,CartManagerCommandReturnVisitor<R> ,CustomerManagerCommandReturnVisitor<R> ,ItemCommandReturnVisitor<R> ,NewlyAddedCommandReturnVisitor<R> {
    
    
}
