
package view.visitor;

import view.*;

public interface CustomerDeliveryExceptionVisitor<E extends view.UserException> {
    
    public void handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException, E;
    public void handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException, E;
    public void handleTestDelivery(TestDeliveryView testDelivery) throws ModelException, E;
    
}
