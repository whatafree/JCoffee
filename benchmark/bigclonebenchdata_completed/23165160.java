


class c23165160 {
public MyHelperClass StringUtils;
	public MyHelperClass getConnection(String o0){ return null; }

    public void exe2(String[] args) {
        Connection con = null;
        Connection con2 = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con =(Connection)(Object) getConnection("mis030dv");
            con2 =(Connection)(Object) getConnection("mis030db");
            con2.setAutoCommit(false);
            stmt =(Statement)(Object) con.createStatement();
            rs =(ResultSet)(Object) stmt.executeQuery("SELECT * FROM MIS.MAP_PUR0101 WHERE NOT EXISTS (SELECT 1 FROM MIS.RSCMGOOD@MIS030DB@DEVU01 WHERE GOODCD = PUM_CODE OR GOODCD = NEW_PUM_CODE)");
            pstmt =(PreparedStatement)(Object) con2.prepareStatement("INSERT INTO MIS.RSCMGOOD ( GOODCD,GOODFLAG,GOODNM,GOODHNGNM,GOODENGNM,GOODSPEC,GOODMODEL,ASETFLAG,LRGCD,MDLCD,SMLCD,EDICD,PRODCMPYCD,CMT,FSTRGSTRID,FSTRGSTDT,LASTUPDTRID,LASTUPDTDT,APPINSTDATA,MNGTFLAG) " + "VALUES ( ?,SUBSTR(?,1,1),?,?,?,?,NULL,'1',substr(?,2,2),substr(?,4,3),NULL,NULL,NULL,'OCS �����빰ǰ','MISASIS',TO_DATE('20111231','YYYYMMDD'),'MISASIS',TO_DATE('20111231','YYYYMMDD'),NULL,'N')");
            int count = 0;
            String goodcd = null;
            String goodnm = null;
            while ((boolean)(Object)rs.next()) {
                count++;
                goodcd =(String)(Object) rs.getString("PUM_CODE").toUpperCase();
                goodnm =(String)(Object) rs.getString("PUM_HNAME");
                StringUtils.trimWhitespace(goodnm);
                if (goodnm == null || goodnm.equals("")) goodnm = "-";
                pstmt.setString(1, goodcd);
                pstmt.setString(2, goodcd);
                pstmt.setString(3, goodnm);
                pstmt.setString(4, goodnm);
                pstmt.setString(5,(String)(Object) rs.getString("PUM_ENAME"));
                pstmt.setString(6,(String)(Object) rs.getString("KYUKYEOK"));
                pstmt.setString(7, goodcd);
                pstmt.setString(8, goodcd);
                pstmt.executeUpdate();
                if (count % 100 == 0) System.out.println("Copy Row : " + count);
            }
            System.out.println("Commit Copy Rows : " + count);
            con2.commit();
        } catch (Exception e) {
            try {
                con2.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
                if (con2 != null) con2.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trimWhitespace(String o0){ return null; }
	public MyHelperClass toUpperCase(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class ResultSetMetaData {

}
