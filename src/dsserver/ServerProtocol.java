package dsserver;

import java.net.*;
import java.io.*;

public class ServerProtocol {
    private final int RECEIVED_STDNO = 1;
    private final int RECEIVED_NAME = 2;
    private final int RECEIVED_FACULTY = 3;
    private final int RECEIVED_COURSE = 4;
    static int state = 0;
    
    public String processInput(int State) {
        String theOutput = null;
        
        if (State == 0) {
            
            theOutput = "Please Enter your Student Number:\n";
            state = RECEIVED_STDNO;
        
        } else if (State == RECEIVED_STDNO) {
            
            theOutput = "Please Enter your Name:\n";
            state = RECEIVED_NAME;
        
        } else if (State == RECEIVED_NAME) {
            
            theOutput = "Please Enter the Faculty you are in:\n";
            state = RECEIVED_FACULTY;
        
        } else if (State == RECEIVED_FACULTY) {
            
            theOutput = "Please Enter the Course you Study:\n";
            state = RECEIVED_COURSE;
        
        } else if (State == RECEIVED_COURSE) {
            
            theOutput = "Bye.";
            state = 0;
        }
        
        return theOutput;
    }
    
    
}
