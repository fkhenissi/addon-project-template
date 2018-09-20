package org.exoplatform.addons;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.picocontainer.Startable;
/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable {

    private static final Log LOG = ExoLogger.getLogger(MyService.class);



    @Override
    public void start() {
        LOG.info("Service is started by @fkhenissy");
    }

    @Override
    public void stop() {
        LOG.error("Service was stopped by @fkhenissy");
    }
}