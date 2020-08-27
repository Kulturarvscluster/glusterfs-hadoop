package org.apache.hadoop.fs.test.base;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileContext;
import org.apache.hadoop.fs.FileContextPermissionBase;
import org.apache.hadoop.fs.local.GlusterFs;

public class GlusterContextPermissionBase extends FileContextPermissionBase {
    @Override
    protected FileContext getFileContext() throws Exception {
        Configuration conf = new Configuration();
        FileContext fc = FileContext.getFileContext(new GlusterFs(conf), conf);
        return fc;
    }
}
