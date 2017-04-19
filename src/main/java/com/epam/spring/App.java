package com.epam.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public Client client;
    public EventLogger eventLogger;
    public EventLogger fileEventLogger;

    public App(Client client, EventLogger eventLogger, EventLogger fileEventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.fileEventLogger=fileEventLogger;
    }

    public void logEvent(Event event){

        event.setMsg(client.getFullName());
        eventLogger.logEvent(event);
        fileEventLogger.logEvent(event);

    }

    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App)ctx.getBean("app");

        app.logEvent((Event)ctx.getBean("event"));


    }
}
