package InterfaceINFO;

//Entry point class
public class Application {

    public static void main(String[] args) {

        //Logger needs a concrete class to implement it and in this case that's ConsoleLogger
        Logger logger = new ConsoleLogger();
        logger.info("hello");
        logger.warning("This is a warning! ");
        logger.error("Opps, this is an error! ");
        logger.fatal("fatal error");
    }
}
