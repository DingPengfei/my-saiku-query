package org.saiku.query;

import junit.framework.TestCase;
import org.olap4j.OlapConnection;
import org.olap4j.OlapException;

/**
 * Created by Ding on 2/5/2018.
 */
public class MysqlTest extends TestCase {
    private TestContext context = TestContext.instance();

    public void testConnection() {
        OlapConnection con = context.createConnection();

        try {
            assertEquals(1, con.getOlapCatalogs().size());
            assertEquals("learn_kylin", con.getOlapCatalogs().get(0).getName());
        } catch (OlapException e) {
            e.printStackTrace();
        }
    }
}
