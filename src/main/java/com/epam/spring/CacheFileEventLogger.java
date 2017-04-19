package com.epam.spring;

import java.util.List;

/**
 * Created by Iana_Kasimova on 4/7/2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    int cacheSize;
    List<Event> cache;

    public CacheFileEventLogger(String filename, int size) {
        super(filename);
        this.cacheSize = size;
    }


    public void writeEventsFromCache(){
        
    }

    public void logEvent(Event event) {
        cache.add(event);

        if(cache.size() == cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }
}
