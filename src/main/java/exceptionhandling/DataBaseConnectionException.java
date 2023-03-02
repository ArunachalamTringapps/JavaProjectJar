package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

class DataBaseConnectionException {
    static DataBaseConnectionException dbc=null;
    static Logger l=Logger.getLogger(DataBaseConnectionException.class.getName());
    private DataBaseConnectionException(){}
    Connection conn;
    public static DataBaseConnectionException getDataBaseConnection(){
        if(dbc==null)
            dbc=new DataBaseConnectionException();
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