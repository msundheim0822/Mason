package com.sg.itemmanager.ui;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface UserIO {
    
    void print(String msg);

    BigDecimal readBigDecimal(String prompt);

    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);

    String readString(String prompt);
    
    LocalDate readLocalDate(String prompt);
}
