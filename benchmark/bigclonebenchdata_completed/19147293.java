
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19147293 {
public MyHelperClass conexionBD;

    public boolean limpiarContrincantexRonda(jugadorxDivxRonda unjxdxr) {
        int intResult = 0;
        String sql = "UPDATE jugadorxdivxronda " + " SET idPareoRival = 0 " + " WHERE idJugxDivxRnd = " + unjxdxr.getIdJugxDivxRnd();
        try {
            MyHelperClass connection = new MyHelperClass();
            connection = conexionBD.getConnection();
//            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass ps = new MyHelperClass();
            ps = connection.prepareStatement(sql);
//            MyHelperClass ps = new MyHelperClass();
            intResult =(int)(Object) ps.executeUpdate();
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            try {
                MyHelperClass connection = new MyHelperClass();
                connection.rollback();
            } catch (UncheckedIOException exe) {
                exe.printStackTrace();
            }
        } finally {
            MyHelperClass ps = new MyHelperClass();
            conexionBD.close(ps);
            MyHelperClass connection = new MyHelperClass();
            conexionBD.close(connection);
        }
        return (intResult > 0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(MyHelperClass o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class jugadorxDivxRonda {

public MyHelperClass getIdJugxDivxRnd(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
