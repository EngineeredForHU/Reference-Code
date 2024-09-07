package InterfaceINFO;

public interface Logger {

    //Interface only has abstracts methods.
    //no implementations

    public void info(String info);
    public void warning(String warning);
    public void error(String error);
    public void fatal(String fatal);
}
