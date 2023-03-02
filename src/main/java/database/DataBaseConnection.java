package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

class DataBaseConnection {
    static DataBaseConnection dbc=null;
    static Logger l=Logger.getLogger(DataBaseConnection.class.getName());
    private DataBaseConnection(){}
    Connection conn;
    public static DataBaseConnection getDataBaseConnection(){
        if(dbc==null)
            dbc=new DataBaseConnection();
        return dbc;
    }
    protected void newConnection(String url,String user,String pass) throws SQLException {
        this.conn= DriverManager.getConnection(url,user,pass);
        l.info("New Connection Connected Successfully");
    }
    protected void closeConnection() throws SQLException{
        this.conn.close();
        l.info("All Connection Closed Successfully");
    }
}