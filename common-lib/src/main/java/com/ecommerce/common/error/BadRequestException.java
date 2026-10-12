package com.ecommerce.common.error;

public class BadRequestException extends BusinessException {
    public BadRequestException(String message) {
        super(ErrorCode.BAD_REQUEST, message);
    }
}
