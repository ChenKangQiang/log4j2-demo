import com.foo.Bar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by chen on 2017/7/5.
 */

public class Test {

    private final static Logger logger = LogManager.getLogger(Test.class.getName());

    public static void main(String[] args) {

        // Test会默认继承Root logger
        logger.trace("开始程序");

        Bar bar = new Bar();

        if (!bar.doIt()) {
            logger.error("hello");
        }

        logger.trace("退出程序");
    }
}
