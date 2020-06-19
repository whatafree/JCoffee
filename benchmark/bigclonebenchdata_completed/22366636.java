import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22366636 {
public MyHelperClass connection;

    public int create(BusinessObject o) throws Throwable, DAOException {
        int insert = 0;
        int id = 0;
        Project project = (Project)(Project)(Object) o;
        try {
            MyHelperClass XMLGetQuery = new MyHelperClass();
            PreparedStatement pst =(PreparedStatement)(Object) connection.prepareStatement(XMLGetQuery.getQuery("INSERT_PROJECT"));
            pst.setString(1, project.getName());
            pst.setString(2, project.getDescription());
            pst.setInt(3, project.getIdAccount());
            pst.setInt(4, project.getIdContact());
            insert =(int)(Object) pst.executeUpdate();
            if (insert <= 0) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows <= 0");
            } else if (insert > 1) {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
                throw new DAOException("Number of rows > 1");
            }
            MyHelperClass connection = new MyHelperClass();
            Statement st =(Statement)(Object) connection.createStatement();
            ResultSet rs =(ResultSet)(Object) st.executeQuery("select max(id_project) from project");
            rs.next();
            id =(int)(Object) rs.getInt(1);
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.write(e.getMessage());
            throw new DAOException("A SQLException has occured");
        } catch (NullPointerException npe) {
            MyHelperClass Log = new MyHelperClass();
            Log.write(npe.getMessage());
            throw new DAOException("Connection null");
        }
        return id;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass getQuery(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BusinessObject {

}

class DAOException extends Exception{
	public DAOException(String errorMessage) { super(errorMessage); }
}

class Project {

public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getIdContact(){ return null; }
	public MyHelperClass getIdAccount(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
