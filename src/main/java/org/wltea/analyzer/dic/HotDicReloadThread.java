package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * @author mati
 * @date 2023-04-04 17:02
 */
public class HotDicReloadThread implements Runnable{

    private static final Logger logger = ESPluginLoggerFactory.getLogger(HotDicReloadThread.class.getName());

    @Override
    public void run() {
        while (true){
            logger.info("-------重新加载mysql词典--------");

            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
