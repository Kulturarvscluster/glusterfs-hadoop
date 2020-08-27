package org.apache.hadoop.fs.test.base;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileContext;
import org.apache.hadoop.fs.FileContextURIBase;
import org.apache.hadoop.fs.local.GlusterFs;
import org.junit.Before;

import java.io.IOException;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DEFAULT_NAME_DEFAULT;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.FS_DEFAULT_NAME_KEY;

public class GlusterContextURIBase extends FileContextURIBase {
    
    @Before
    public void setUp() throws IOException, Exception {
        Configuration GlusterConf = new Configuration();
        Configuration localConf = new Configuration();
    
        localConf.set(FS_DEFAULT_NAME_KEY, FS_DEFAULT_NAME_DEFAULT);
        fc1 = FileContext.getFileContext(GlusterConf);
        fc2 = FileContext.getFileContext(localConf);
    }
}
