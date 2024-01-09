package org.example.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionConfiguration {

    public static Connection getConnection(String jdbcUrl, String user, String password) {
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, user, password);
            return connection;
        } catch (SQLException sQLException) {
            System.err.println("Exception in Database Connection");
        }
        return connection;
    }

}


// disease d_id name
// disease_mul   index d_id(foreign) spe_id(foreign) 
// doctor   do_id  do_name spe_id(foreign)

/*get speciality_id from disease_mul
find speciality_id in doctor table and collect all the list off
 * 
 */


/**
 *select * from disease_mul dm
 right join doctor d on dm.d_id = d.do_id
 where index=111;
  */

