import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371607 {

    public void removeRealm(final List<Integer> realmIds)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realm.remove"));
                    Iterator<Integer> iter = realmIds.iterator();
                    int realmId;
                    while (iter.hasNext()) {
                        realmId = iter.next();
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, realmId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                        MyHelperClass cmDB = new MyHelperClass();
                        cmDB.removeRealm(realmId);
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException sqle) {
            MyHelperClass log = new MyHelperClass();
            log.error((SQLException)(Object)sqle);
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.rollback();
                } catch (UncheckedIOException ex) {
                }
            }
        } finally {
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.setAutoCommit(true);
                } catch (UncheckedIOException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass removeRealm(int o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(){}
	ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(){ return null; }
	public MyHelperClass executeNull( ExecuteProcessAbstractImpl o0){ return null; }}
