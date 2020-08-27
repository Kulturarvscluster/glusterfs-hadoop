package org.apache.hadoop.fs.filecontext;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileContext;
import org.apache.hadoop.fs.FileContextUtilBase;
import org.apache.hadoop.fs.filecontext.GlusterFs;
import org.junit.Before;

import java.io.IOException;

public class GlusterContextUtilBase extends FileContextUtilBase {
    
    
    @Before
    public void setUp() throws IOException, Exception {
        Configuration conf = new Configuration();
        fc = FileContext.getFileContext(new GlusterFs(conf), conf);
        super.setUp();
    }
}
