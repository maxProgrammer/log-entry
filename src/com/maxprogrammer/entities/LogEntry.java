package com.maxprogrammer.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String userName;
    private Date moment;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public String toString() {
        return "User: " +
                getUserName() +
                ", Access Date: " +
                sdf.format(getMoment());

    }
}
