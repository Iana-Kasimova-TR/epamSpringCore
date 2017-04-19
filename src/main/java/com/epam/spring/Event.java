package com.epam.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;


/**
 * Created by Iana_Kasimova on 3/30/2017.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Random rand, Date date, DateFormat df){
        this.id = rand.nextInt(100);
        this.date = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }


}
