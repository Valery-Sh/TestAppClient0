package org.cdms;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Valery
 */
public class RemoteValidationException extends RuntimeException {
    private List<RemoteConstraintViolation> violations;
    
    public RemoteValidationException(String message) {
        super(message);
        violations = new ArrayList<RemoteConstraintViolation>();
    }
    public RemoteValidationException(String message,Object invalidValue,String constraintMessage,
            String constraintMessageTemplate, String propertyPath) {
        this(message);
//        this.invalidValue = invalidValue;
//        this.constraintMessage = constraintMessage;
//        this.constraintMessageTemplate = constraintMessageTemplate;
//        this.propertyPath = propertyPath;
    }

    public List<RemoteConstraintViolation> getViolations() {
        return violations;
    }
    
}
