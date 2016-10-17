
package model.visitor;

public interface CommandReturnVisitor<R> extends ArticleCommandReturnVisitor<R> ,CustomerCommandReturnVisitor<R> ,ItemCommandReturnVisitor<R> ,NewlyAddedCommandReturnVisitor<R> {
    
    
}
