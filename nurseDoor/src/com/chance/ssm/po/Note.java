package com.chance.ssm.po;

import java.util.Date;

public class Note {
    private String noteId;

    private String noteName;

    private Date noteCrtetime;

    private String noteCrteadmin;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId == null ? null : noteId.trim();
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName == null ? null : noteName.trim();
    }

    public Date getNoteCrtetime() {
        return noteCrtetime;
    }

    public void setNoteCrtetime(Date noteCrtetime) {
        this.noteCrtetime = noteCrtetime;
    }

    public String getNoteCrteadmin() {
        return noteCrteadmin;
    }

    public void setNoteCrteadmin(String noteCrteadmin) {
        this.noteCrteadmin = noteCrteadmin == null ? null : noteCrteadmin.trim();
    }
}