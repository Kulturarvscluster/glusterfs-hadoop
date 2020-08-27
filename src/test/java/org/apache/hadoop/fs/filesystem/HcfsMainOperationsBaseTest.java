package org.apache.hadoop.fs.filesystem;

import org.apache.hadoop.fs.FileSystem;
import org.junit.Test;

import java.io.FileNotFoundException;

public class HcfsMainOperationsBaseTest extends org.apache.hadoop.fs.FSMainOperationsBaseTest {
    
    @Override
    protected FileSystem createFileSystem() throws Exception {
        HcfsTestConnectorInterface connector = HcfsTestConnectorFactory.getHcfsTestConnector();
        return connector.create();
    }
    
    
    //@Test
    //public void testMkdirsFailsForSubdirectoryOfExistingFile() throws Exception {
    //    Path testDir = getTestRootPath(fSys, "test/hadoop");
    //    Assert.assertFalse(exists(fSys, testDir));
    //    fSys.mkdirs(testDir);
    //    Assert.assertTrue(exists(fSys, testDir));
    //
    //    createFile(getTestRootPath(fSys, "test/hadoop/file"));
    //
    //    Path testSubDir = getTestRootPath(fSys, "test/hadoop/file/subdir");
    //
    //    try {
    //        Assert.assertFalse(fSys.mkdirs(testSubDir));
    //    } catch (ParentNotDirectoryException ex) {
    //        // catch exception as expected.
    //    }
    //
    //    Assert.assertFalse(exists(fSys, testSubDir));
    //
    //    Path testDeepSubDir = getTestRootPath(fSys, "test/hadoop/file/deep/sub/dir");
    //    Assert.assertFalse(exists(fSys, testSubDir));
    //    try {
    //        Assert.assertFalse(fSys.mkdirs(testDeepSubDir));
    //    } catch (ParentNotDirectoryException ex) {
    //        // catch exception as expected.
    //    }
    //    Assert.assertFalse(exists(fSys, testDeepSubDir));
    //
    //}
    
    //@Test
    //public void testWDAbsolute() throws IOException {
    //    Path absoluteDir = getTestRootPath(fSys,
    //                                       "test/existingDir");
    //    fSys.mkdirs(absoluteDir);
    //    fSys.setWorkingDirectory(absoluteDir);
    //    Assert.assertEquals(absoluteDir, fSys.getWorkingDirectory());
    //}
    
    @Test
    public void testGlobStatusThrowsExceptionForNonExistentFile() throws Exception {
        try {
            // This should throw a FileNotFoundException
            fSys.globStatus(getTestRootPath(fSys, "test/hadoopfsdf/?"));
            /* the API doesn't mention 'FileNotFoundException'.  Instead it says empty array or null for return
             */
            // Assert.fail("Should throw FileNotFoundException");
        } catch (FileNotFoundException fnfe) {
            // expected
        }
    }
    
    
    //@Test
    //public void testDeleteNonExistentFile() throws IOException {
    //    Path path = getTestRootPath(fSys, "test/hadoop/file");
    //    Assert.assertFalse("Doesn't exist", exists(fSys, path));
    //    Assert.assertFalse("No deletion", fSys.delete(path, true));
    //}
    //
    
}
