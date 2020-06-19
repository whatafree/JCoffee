


class c4961125 {
public MyHelperClass close(Connection o0, PreparedStatement o1){ return null; }

    private void alterarCategoria(Categoria cat) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            MyHelperClass C3P0Pool = new MyHelperClass();
            conn =(Connection)(Object) C3P0Pool.getConnection();
            String sql = "UPDATE categoria SET nome_categoria = ? where id_categoria = ?";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.setString(1, cat.getNome());
            ps.setInt(2, cat.getCodigo());
            ps.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            if (conn != null) conn.rollback();
            throw e;
        } finally {
            close(conn, ps);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }}

class Categoria {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getNome(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
