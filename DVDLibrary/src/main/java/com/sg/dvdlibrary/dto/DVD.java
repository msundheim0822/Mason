package com.sg.dvdlibrary.dto;

import java.util.Objects;

public class DVD {
    
    private String title; 
    private String releaseDate;
    private String MPAA;
    private String director;
    private String studio;
    private String note;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.title);
        hash = 19 * hash + Objects.hashCode(this.releaseDate);
        hash = 19 * hash + Objects.hashCode(this.MPAA);
        hash = 19 * hash + Objects.hashCode(this.director);
        hash = 19 * hash + Objects.hashCode(this.studio);
        hash = 19 * hash + Objects.hashCode(this.note);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        if (!Objects.equals(this.MPAA, other.MPAA)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "DVD{" + "Title=" + title + ", ReleaseDate=" + releaseDate
                + ", Director=" + director + ", Studio=" + studio
                + ", MPAA=" + MPAA + ", Note=" + note;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getReleaseDate() {
        return releaseDate;
    }
    
    public void setMPAA(String MPAA) {
        this.MPAA = MPAA;
    }
    
    public String getMPAA() {
        return MPAA;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    public String getStudio() {
        return studio;
    }
    
    public void setNote(String rating) {
        this.note = rating;
    }
    
    public String getNote() {
        return note;
    }
}
