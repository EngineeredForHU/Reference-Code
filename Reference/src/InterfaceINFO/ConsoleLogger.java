package InterfaceINFO;

import java.util.Date;

//                              Can add more implements with comma ','
public class ConsoleLogger implements Logger{

    @Override
    public void info(String info) {
        Date date = new Date();
        System.out.println(date.toString() + ": " + info);

    }

    @Override
    public void warning(String warning) {
        Date date = new Date();
        System.out.println("Warning - " + date.toString() + ": " + warning);
    }

    @Override
    public void error(String error) {
        Date date = new Date();
        System.err.println("Error - " + date.toString() + ": " + error);

    }

    @Override
    public void fatal(String fatal) {
        Date date = new Date();
        System.err.println("FATAL!! " + date.toString() + ": "+ fatal.toUpperCase());

    }
}
