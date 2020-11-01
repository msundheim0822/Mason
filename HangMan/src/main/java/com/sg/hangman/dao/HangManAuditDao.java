
package com.sg.hangman.dao;

import com.sg.hangman.dto.Word;

public interface HangManAuditDao {
    public void writeAuditBeginning(Word entry)throws HangManPersistenceException;
    public boolean writeAuditEnding(boolean win) throws HangManPersistenceException;
}
