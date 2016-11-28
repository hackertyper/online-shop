
package view.visitor;

import view.*;

public interface CustomerDeliveryReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException, E;
    public R handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException, E;
    public R handleTestDelivery(TestDeliveryView testDelivery) throws ModelException, E;
    
}
