package com.epam.spring;

import org.apache.commons.io.FileUtils;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Iana_Kasimova on 3/30/2017.
 */
public class FileEventLogger  implements EventLogger {
    String filename;
    File file;

    public FileEventLogger(String filename){
        this.filename = filename;
        this.file = new File(this.filename);
    }

    public void logEvent(Event event){
        try {
           FileUtils.writeStringToFile(this.file, event.toString());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void init() throws IOException {
        this.file = new File(this.filename);
        // check file write access
    }
}
