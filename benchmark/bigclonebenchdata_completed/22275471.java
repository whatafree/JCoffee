
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22275471 {

    public static boolean update(Funcionario objFuncionario) {
        int result = 0;
        MyHelperClass DBConnection = new MyHelperClass();
        Connection c =(Connection)(Object) DBConnection.getConnection();
        PreparedStatement pst = null;
        if (c == null) {
            return false;
        }
        try {
            c.setAutoCommit(false);
            final String sql = "update funcionario " + " set nome = ? , cpf = ? , telefone = ? , email = ?, senha = ?, login = ?, id_cargo = ?" + " where id_funcionario = ?";
            pst =(PreparedStatement)(Object) c.prepareStatement(sql);
            pst.setString(1, objFuncionario.getNome());
            pst.setString(2, objFuncionario.getCpf());
            pst.setString(3, objFuncionario.getTelefone());
            pst.setString(4, objFuncionario.getEmail());
            pst.setString(5, objFuncionario.getSenha());
            pst.setString(6, objFuncionario.getLogin());
            pst.setLong(7, (objFuncionario.getCargo()).getCodigo());
            pst.setLong(8, objFuncionario.getCodigo());
            result =(int)(Object) pst.executeUpdate();
            c.commit();
        } catch (UncheckedIOException e) {
            try {
                c.rollback();
            } catch (UncheckedIOException e1) {
                System.out.println("[FuncionarioDAO.update] Erro ao atualizar -> " + e1.getMessage());
            }
            System.out.println("[FuncionarioDAO.update] Erro ao atualizar -> " + e.getMessage());
        } finally {
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closePreparedStatement(pst);
//            MyHelperClass DBConnection = new MyHelperClass();
            DBConnection.closeConnection(c);
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass closeConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Funcionario {

public MyHelperClass getCpf(){ return null; }
	public MyHelperClass getCargo(){ return null; }
	public MyHelperClass getNome(){ return null; }
	public MyHelperClass getTelefone(){ return null; }
	public MyHelperClass getLogin(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getSenha(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
