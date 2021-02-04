package com.example.demo.model.exception;

import com.example.demo.model.errors.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemServiceException extends RuntimeException {
    private String message;
    private ErrorCode errorCode;
}
