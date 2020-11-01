package com.sg.hangman.dao;

import com.sg.hangman.dto.Word;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;


public class HangManAuditDaoFileImpl implements HangManAuditDao{
	public static final String AUDIT_FILE = "audit.txt";
   
    @Override
    public void writeAuditBeginning(Word entry) throws HangManPersistenceException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new HangManPersistenceException("Could not persist audit information.", e);
        }
        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry.getString() + " randomly selected.");
        out.flush();
    }
    
    @Override
    public boolean writeAuditEnding(boolean win) throws HangManPersistenceException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new HangManPersistenceException("Could not persist audit information.", e);
        }
        LocalDateTime timestamp = LocalDateTime.now();
            if (win){
		out.println(timestamp.toString() + " : WIN");
            } else {
		out.println(timestamp.toString() + " : LOSE");
            }
        out.flush();
        return win;
    }
}