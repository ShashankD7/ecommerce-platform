package com.ecommerce.common.error;

public class ResourceNotFoundException  extends BusinessException {
    public ResourceNotFoundException(String resourceName, Object id) {
        super(ErrorCode.RESOURCE_NOT_FOUND, resourceName + " Not found with id: " + id);
    }
}
