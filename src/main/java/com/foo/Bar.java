package com.foo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by chen on 2017/7/5.
 */

public class Bar {

    // logger的name为Bar.class.getName()，即com.foo.Bar
    static final Logger logger = LogManager.getLogger(Bar.class.getName());

    public boolean doIt() {

        logger.trace("Enter");    // 等价于 logger.entry(); entry()方法已经废弃
        logger.debug("Debug");
        logger.warn("Warn");
        logger.info("Info");
        logger.error("Did it again!");
        logger.trace("Exit");
        return false;
    }


}
