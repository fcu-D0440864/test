package test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {

	private static final Logger LOGGER = LoggerFactory.getLogger(test.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.info("Test log4j2 info");
        LOGGER.warn("Test log4j2 warn");
        LOGGER.error("Test log4j2 error");

	}

}
