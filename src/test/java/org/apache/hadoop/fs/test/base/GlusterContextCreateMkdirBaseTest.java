package org.apache.hadoop.fs.test.base;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileContext;
import org.apache.hadoop.fs.FileContextCreateMkdirBaseTest;
import org.apache.hadoop.fs.FileContextMainOperationsBaseTest;
import org.apache.hadoop.fs.local.GlusterFs;
import org.junit.Before;

import java.io.IOException;

public class GlusterContextCreateMkdirBaseTest extends FileContextCreateMkdirBaseTest {
    
    @Before
    public void setUp() throws IOException, Exception {
        Configuration conf = new Configuration();
        fc = FileContext.getFileContext(new GlusterFs(conf), conf);
        super.setUp();
    }
}
