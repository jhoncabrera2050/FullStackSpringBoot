package com.ventas.ventas.exeption;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExecptionResponse> manejaTodasExepciones(Exception e){
		ExecptionResponse execptionResponse = new ExecptionResponse(

		);
		return new ResponseEntity<>(execptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
