package java_lecture2;

import java.io.IOException;
import java.util.logging.*;

/**
 * Логирование
 */
public class program6 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(program6.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        // logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }

}
