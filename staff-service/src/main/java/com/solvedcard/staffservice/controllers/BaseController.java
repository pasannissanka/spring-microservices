package com.solvedcard.staffservice.controllers;

import com.solvedcard.beans.constants.ErrorMessages;
import com.solvedcard.beans.dtos.responses.ResponseData;
import com.solvedcard.beans.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class BaseController {
    private final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<ResponseData<?, ?>> handleNotFoundException(NotFoundException ex, WebRequest request) {
        logger.error("NotFoundException : [{}], request: [{}]", ex.getMessage(), request);
        return new ResponseEntity<>(ResponseData.error(ex.getMessage(), ErrorMessages.NOT_FOUND), new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ResponseData<?, ?>> handleRuntimeException(Exception ex, WebRequest request) {
        logger.error("RuntimeException : [{}], request: [{}]", ex.getMessage(), request);
        return new ResponseEntity<>(ResponseData.error(ex.getMessage(), ErrorMessages.INTERNAL_SERVER_ERROR), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ResponseData<?, ?>> handleException(Exception ex, WebRequest request) {
        logger.error("Exception : [{}], request: [{}]", ex.getMessage(), request);
        return new ResponseEntity<>(ResponseData.error(ex.getMessage(), ErrorMessages.INTERNAL_SERVER_ERROR), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
