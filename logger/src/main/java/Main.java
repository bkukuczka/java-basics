import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String... args) {
        Logger logger = LoggerFactory.getLogger(Main.class);

        logger.trace("Log on level trace.");
        logger.info("Log on level info.");
        logger.debug("Log on level debug.");
        logger.warn("Log on level warn.");
        logger.error("Log on level error.");
    }
}
