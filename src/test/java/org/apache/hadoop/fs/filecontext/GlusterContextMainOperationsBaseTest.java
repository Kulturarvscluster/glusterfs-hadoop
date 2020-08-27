package org.apache.hadoop.fs.filecontext;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileContext;
import org.apache.hadoop.fs.FileContextMainOperationsBaseTest;
import org.apache.hadoop.fs.filecontext.GlusterFs;
import org.junit.Before;

import java.io.IOException;

public class GlusterContextMainOperationsBaseTest extends FileContextMainOperationsBaseTest {
    
    @Before
    public void setUp() throws IOException, Exception {
        Configuration conf = new Configuration();
        fc = FileContext.getFileContext(new GlusterFs(conf), conf);
        super.setUp();
    }
 
    
    @Override
    protected boolean listCorruptedBlocksSupported() {
        return false;
    }
}
