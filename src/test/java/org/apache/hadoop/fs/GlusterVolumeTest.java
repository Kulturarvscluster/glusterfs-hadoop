package org.apache.hadoop.fs;

import junit.framework.Assert;
import org.apache.hadoop.conf.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  This class is for tests which are gluster specific.
 */ 
public class GlusterVolumeTest {
   
    Logger log = LoggerFactory.getLogger(GlusterVolumeTest.class);
    static Configuration  config = null;
 
    @org.junit.Test
    public void testNullURI() { 
	Assert.assertNotNull(new org.apache.hadoop.fs.filesystem.GlusterVolume().getUri());
    }
    
}
