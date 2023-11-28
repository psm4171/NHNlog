package com.nhnacademy.student;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class EncodingFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
