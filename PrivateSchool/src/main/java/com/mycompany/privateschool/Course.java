package com.mycompany.privateschool;

public class Course {

    private String title;
    private String stream;
    private String type;
    private long startDate;
    private long endDate;

    Course(String title, String stream, String type,
            long startDate, long endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title
                + ", stream=" + stream
                + ", type=" + type
                + ", startDate=" + startDate
                + ", endDate=" + endDate + '}';
    }

}
