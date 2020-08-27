package org.apache.hadoop.fs.test.base;

import org.apache.hadoop.fs.FileSystemContractBaseTest;
import org.apache.hadoop.fs.test.connector.HcfsTestConnectorFactory;
import org.apache.hadoop.fs.test.connector.HcfsTestConnectorInterface;
import org.junit.After;
import org.junit.Before;

public class HcfsContractBaseTest extends FileSystemContractBaseTest {
    @Before
    public void setUp() throws Exception {
        HcfsTestConnectorInterface connector = HcfsTestConnectorFactory.getHcfsTestConnector();
        fs = connector.create();
    }
    
    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
    
}
