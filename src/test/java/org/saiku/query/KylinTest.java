package org.saiku.query;

import junit.framework.TestCase;
import mondrian.olap.Util;
import org.olap4j.*;
import org.olap4j.layout.RectangularCellSetFormatter;

import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by Ding on 2/5/2018.
 */
public class KylinTest extends TestCase {
    private TestContext context = TestContext.instance();

    public void testConnection() {
        OlapConnection con = context.createConnection();

        try {
            assertEquals(1, con.getOlapCatalogs().size());
            assertEquals("learn_kylin", con.getOlapCatalogs().get(0).getName());
        } catch (OlapException e) {
            e.printStackTrace();
        }

        simpleQuery();
    }

    public void simpleQuery() {
        OlapConnection connection = context.createConnection();
        final OlapWrapper wapper = connection;
        try {
            OlapConnection olapConnection = (OlapConnection) wapper.unwrap(OlapConnection.class);
            OlapStatement stmt = olapConnection.createStatement();
//            CellSet cellSet = stmt.executeOlapQuery("SELECT\n" +
//                            " {[Measures].[购买用户数量], [Measures].[商品价格]} ON COLUMNS,\n" +
//                            "{[城市].[城市名称].Members} ON ROWS\n" +
//                            "FROM [测试]"
//            );

            String queryString = "SELECT\n" +
                    "{[Measures].[购买用户数量], [Measures].[商品价格]} ON COLUMNS,\n" +
                    "{[Buyer].[购买者所在城市].Members} ON ROWS\n" +
                    "FROM [测试]";

//            String query = Util.unparse(queryString);

            //设置SQL最大执行时间
//            stmt.setQueryTimeout(10);

            CellSet cellSet = stmt.executeOlapQuery(queryString);

            // We use the utility formatter.
            RectangularCellSetFormatter formatter = new RectangularCellSetFormatter(false);

            // Print out.
            PrintWriter writer = new PrintWriter(System.out);
            formatter.format(cellSet, writer);
            writer.flush();
//            System.out.println(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
