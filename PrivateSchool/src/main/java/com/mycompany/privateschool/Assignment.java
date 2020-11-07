package com.mycompany.privateschool;

import java.util.Date;

public class Assignment {

    private TitleName title;
    private String description;
    private Date subDateTime;
    private byte oralMark;
    private byte totalMark;

    Assignment(TitleName title, String description,
            Date subDateTime, byte oralMark, byte totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    public byte getOralMark() {
        return oralMark;
    }

    public void setOralMark(byte oralMark) {
        this.oralMark = oralMark;
    }

    public byte getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(byte totalMark) {
        this.totalMark = totalMark;
    }

}
