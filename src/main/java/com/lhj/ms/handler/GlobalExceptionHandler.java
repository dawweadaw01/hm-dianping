package com.lhj.ms.handler;

import com.lhj.ms.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import java.util.Objects;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        log.error("[MethodArgumentNotValidException]: {}", exception.getMessage());
        return Result.fail(Objects.requireNonNull(exception.getBindingResult().getFieldError()).getDefaultMessage());
    }
    @ExceptionHandler(value = MissingServletRequestPartException.class)
    public Result missingServletRequestPartExceptionHandler(MissingServletRequestPartException exception) {
        log.error("[MissingServletRequestPartException]: {}", exception.getMessage());
        return Result.fail("文件不能为空");
    }
}
