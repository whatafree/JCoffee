import java.io.*;
import java.lang.*;
import java.util.*;



class c8109022 {
public static MyHelperClass indexDocument(MyHelperClass o0, FileInputStream o1, MyHelperClass o2){ return null; }
public static MyHelperClass NULL;
//	public MyHelperClass indexDocument(MyHelperClass o0, FileInputStream o1, MyHelperClass o2){ return null; }
//public MyHelperClass NULL;
	public static MyHelperClass log;
	public static MyHelperClass GlobalConstant;
	public static MyHelperClass closeDBConn(){ return null; }
	public static MyHelperClass genUserDefinedIndex(MyHelperClass o0, Hashtable o1){ return null; }
	public static MyHelperClass getTableKey(MyHelperClass o0){ return null; }
	public static MyHelperClass getCurrentTimestamp(){ return null; }
	public static MyHelperClass formatNumber(int o0){ return null; }
public static MyHelperClass sUdfDetailID;
	public static MyHelperClass dmsDocument;
	public static MyHelperClass conn;
	public static MyHelperClass stat;
	public static MyHelperClass sUdfID;
	public static MyHelperClass indexPath;
	public static MyHelperClass openDBConn(){ return null; }
//	public MyHelperClass getTableKey(MyHelperClass o0){ return null; }
//	public MyHelperClass genUserDefinedIndex(MyHelperClass o0, Hashtable o1){ return null; }
//	public MyHelperClass getCurrentTimestamp(){ return null; }
//public MyHelperClass sUdfID;
//	public MyHelperClass sUdfDetailID;
//	public MyHelperClass stat;
//	public MyHelperClass conn;
//	public MyHelperClass dmsDocument;
//	public MyHelperClass log;
//	public MyHelperClass GlobalConstant;
	public MyHelperClass currTime;
//	public MyHelperClass indexPath;
//	public MyHelperClass openDBConn(){ return null; }
//	public MyHelperClass closeDBConn(){ return null; }
//	public MyHelperClass formatNumber(int o0){ return null; }

    public static void main(String args[]) throws Exception {
        MyHelperClass currTime = new MyHelperClass();
        currTime = getCurrentTimestamp();
        String sqlDoc = "";
        String sqlVersion = "";
        String sqlDocVersion = "";
        String sqlContent = "";
        String sqlDocDetail = "";
        String sqlRoot = "";
        java.util.Properties props = new java.util.Properties();
        String path = new LoadDocumentData().getClass().getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
        if (!path.endsWith("/")) {
            path += "/";
        }
        path += "generate.properties";
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(path));
        props.load(fis);
        String author =(String)(Object) NULL; //new String();
        author = props.getProperty("author");
        String srcPath =(String)(Object) NULL; //new String();
        srcPath = props.getProperty("srcPath");
        String driverStr =(String)(Object) NULL; //new String();
        driverStr = props.getProperty("driverStr");
        String dbConnStr =(String)(Object) NULL; //new String();
        dbConnStr = props.getProperty("dbConnStr");
        String dbUsername =(String)(Object) NULL; //new String();
        dbUsername = props.getProperty("dbUsername");
        String dbPassword =(String)(Object) NULL; //new String();
        dbPassword = props.getProperty("dbPassword");
        openDBConn();
        stat = conn.createStatement();
        Hashtable htTableKey = new Hashtable();
        htTableKey =(Hashtable)(Object) getTableKey(conn);
        genUserDefinedIndex(conn, htTableKey);
        Integer ownerID = new Integer(0);
        Integer nDocID = new Integer(1);
        Integer nDocDetailID = new Integer(1);
        Integer nVersionID = new Integer(1);
        Integer nContentID = new Integer(1);
        Integer nDmsRootID = new Integer(1);
        Integer nMtmDocVersionID = new Integer(1);
        Integer nParentID = null;
        Integer nRootID = null;
        String sName = "1000000001.txt";
        String sConvertedName = "1000000001";
        if (htTableKey.containsKey("DMS_DOCUMENT")) {
            nDocID = new Integer(((Integer) htTableKey.get("DMS_DOCUMENT")).intValue() + 1);
        }
        if (htTableKey.containsKey("DMS_DOCUMENT_DETAIL")) {
            nDocDetailID = new Integer(((Integer) htTableKey.get("DMS_DOCUMENT_DETAIL")).intValue() + 1);
        }
        if (htTableKey.containsKey("DMS_VERSION")) {
            nVersionID = new Integer(((Integer) htTableKey.get("DMS_VERSION")).intValue() + 1);
        }
        if (htTableKey.containsKey("DMS_CONTENT")) {
            nContentID = new Integer(((Integer) htTableKey.get("DMS_CONTENT")).intValue() + 1);
        }
        if (htTableKey.containsKey("DMS_ROOT")) {
            nDmsRootID = new Integer(((Integer) htTableKey.get("DMS_ROOT")).intValue() + 1);
        }
        if (htTableKey.containsKey("MTM_DOCUMENT_VERSION")) {
            nMtmDocVersionID = new Integer(((Integer) htTableKey.get("MTM_DOCUMENT_VERSION")).intValue() + 1);
        }
        int nStart = (new Integer(args[0])).intValue();
        int nEnd = (new Integer(args[1])).intValue();
        nParentID = new Integer(args[2]);
        Integer nRootParentID = new Integer(args[2]);
        nRootID = new Integer(args[3]);
        String sPhysicalLoc = new String(args[4]);
        indexPath =(MyHelperClass)(Object) new String(args[5]);
        System.out.println("rootID : " + nRootID + "  ParentID " + nParentID + " physical Loc = " + sPhysicalLoc);
        String sFieldValue = "";
        PreparedStatement preStat = null;
        String sDocName = "";
        int count = 0;
        int total = 0;
        FileInputStream infile = new FileInputStream(new File(sPhysicalLoc + sName));
        byte[] buffer = new byte[infile.available()];
        infile.read(buffer);
        String inFileData = new String(buffer);
        for (int i = nStart; i <= nEnd; i++) {
            try {
                sFieldValue = "REF" + i;
                sDocName = Calendar.getInstance().getTimeInMillis() + ".tif";
                dmsDocument.setID(nDocID);
                dmsDocument.setDocumentType("D");
                dmsDocument.setParentID(nParentID);
                dmsDocument.setRootID(nRootID);
                dmsDocument.setCreateType("S");
                dmsDocument.setReferenceNo("Ref Num");
                dmsDocument.setDescription("desc");
                dmsDocument.setUdfDetailList(new ArrayList());
                dmsDocument.setEffectiveStartDate(currTime);
                dmsDocument.setItemSize(new Integer(20480));
                dmsDocument.setItemStatus("A");
                dmsDocument.setOwnerID(new Integer(0));
                dmsDocument.setUpdateCount(new Integer(0));
                dmsDocument.setCreatorID(new Integer(0));
                dmsDocument.setCreateDate(currTime);
                dmsDocument.setUpdaterID(new Integer(0));
                dmsDocument.setUpdateDate(currTime);
                dmsDocument.setRecordStatus("A");
                if (count % 500 == 0) {
                    sDocName = "TestDocument" + i;
                    dmsDocument.setDocumentName(sDocName);
                    dmsDocument.setDocumentType("F");
                    sqlDoc = "INSERT INTO DMS_DOCUMENT VALUES(" + nDocID.toString() + ",'" + sDocName + "','F'," + nRootParentID + "," + nRootID.toString() + ", 'S', '" + dmsDocument.getCreateDate().toString() + "', NULL, '" + ownerID + "','Ref Num', 'desc', 0, 'A', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,'A',0,0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                    preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlDoc);
                    preStat.executeUpdate();
                    nParentID = nDocID;
                    nDocID = new Integer(nDocID.intValue() + 1);
                }
                total = count + nStart;
                System.out.println("xxx Count: " + total + " docID = " + nDocID);
                sDocName = "TestFullText" + i + ".txt";
                dmsDocument.setDocumentName(sDocName);
                sqlDoc = "INSERT INTO DMS_DOCUMENT VALUES(" + nDocID.toString() + ",'" + sDocName + "','D'," + nParentID.toString() + "," + nRootID.toString() + ", 'S','" + dmsDocument.getCreateDate().toString() + "', NULL, '" + ownerID + "','Ref Num', 'desc', 20480, 'A', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'A',0,0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlDoc);
                preStat.executeUpdate();
                sqlDocDetail = "INSERT INTO DMS_DOCUMENT_DETAIL VALUES(" + nDocDetailID.toString() + "," + nDocID.toString() + "," + sUdfID + "," + sUdfDetailID + ",'" + sFieldValue + "', null, null, 'A',0,0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlDocDetail);
                preStat.executeUpdate();
                dmsDocument.setUserDefinedFieldID(new Integer((int)(Object)sUdfID));
                sqlContent = " INSERT INTO DMS_CONTENT VALUES (" + nContentID.toString() + "," + sConvertedName + ", 'IMAGE', null, 'TIF', 'A', 0,0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlContent);
                preStat.executeUpdate();
                dmsDocument.setContentID(nContentID);
                sqlVersion = "INSERT INTO DMS_VERSION VALUES(" + nVersionID.toString() + ", " + nDocID.toString() + ", 1,'ROOT',0," + nContentID.toString() + ",0, 'Ref Num', 'desc', 20480, 'A', null, 'A',0,0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlVersion);
                preStat.executeUpdate();
                dmsDocument.setVersionID(nVersionID);
                dmsDocument.setVersionID(new Integer(1));
                dmsDocument.setVersionLabel("ROOT");
                sqlDocVersion = "INSERT INTO MTM_DOCUMENT_VERSION VALUES(" + nMtmDocVersionID.toString() + "," + nDocID.toString() + "," + nVersionID.toString() + ",'A', 0, 0,'" + dmsDocument.getCreateDate().toString() + "',0,'" + dmsDocument.getCreateDate().toString() + "')";
                preStat =(PreparedStatement)(Object) conn.prepareStatement(sqlDocVersion);
                preStat.executeUpdate();
                nDocID = new Integer(nDocID.intValue() + 1);
                nDocDetailID = new Integer(nDocDetailID.intValue() + 1);
                nVersionID = new Integer(nVersionID.intValue() + 1);
                nContentID = new Integer(nContentID.intValue() + 1);
                nDmsRootID = new Integer(nDmsRootID.intValue() + 1);
                nMtmDocVersionID = new Integer(nMtmDocVersionID.intValue() + 1);
                SessionContainer sessionContainer = new SessionContainer();
                if ("D".equals(dmsDocument.getDocumentType())) {
                    File outFile = new File(sPhysicalLoc + "temp.txt");
                    PrintStream out = new PrintStream(new FileOutputStream(outFile, false), true);
                    out.println(formatNumber(i));
                    out.print(inFileData);
                    try {
                        out.close();
                    } catch (Exception ignore) {
                        out = null;
                    }
                    FileInputStream data = new FileInputStream(outFile);
                    indexDocument(dmsDocument, data, GlobalConstant.OP_MODE_INSERT);
                    try {
                        data.close();
                    } catch (Exception ignore) {
                        data = null;
                    }
                }
                count++;
            } catch (Exception ee) {
                log.error(ee, ee);
                conn.rollback();
            } finally {
                try {
                    preStat.close();
                    conn.rollback();
                } catch (Exception ep) {
                }
            }
        }
        try {
            infile.close();
        } catch (Exception ignore) {
            infile = null;
        }
        PreparedStatement statment = null;
        if (htTableKey.containsKey("DMS_DOCUMENT")) {
            statment =(PreparedStatement)(Object) conn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=" + nDocID.toString() + " WHERE TABLE_NAME='DMS_DOCUMENT'");
            statment.executeUpdate();
        } else {
            statment =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SYS_TABLE_KEY VALUES('DMS_DOCUMENT', " + nDocID.toString() + ")");
            statment.executeUpdate();
        }
        if (htTableKey.containsKey("DMS_DOCUMENT_DETAIL")) {
            statment =(PreparedStatement)(Object) conn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=" + nDocDetailID.toString() + " WHERE TABLE_NAME='DMS_DOCUMENT_DETAIL'");
            statment.executeUpdate();
        } else {
            statment =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SYS_TABLE_KEY VALUES('DMS_DOCUMENT_DETAIL', " + nDocDetailID.toString() + ")");
            statment.executeUpdate();
        }
        if (htTableKey.containsKey("DMS_VERSION")) {
            statment =(PreparedStatement)(Object) conn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=" + nVersionID.toString() + " WHERE TABLE_NAME='DMS_VERSION'");
            statment.executeUpdate();
        } else {
            statment =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SYS_TABLE_KEY VALUES('DMS_VERSION', " + nVersionID.toString() + ")");
            statment.executeUpdate();
        }
        if (htTableKey.containsKey("DMS_CONTENT")) {
            statment =(PreparedStatement)(Object) conn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=" + nContentID.toString() + " WHERE TABLE_NAME='DMS_CONTENT'");
            statment.executeUpdate();
        } else {
            statment =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SYS_TABLE_KEY VALUES('DMS_CONTENT', " + nContentID.toString() + ")");
            statment.executeUpdate();
        }
        if (htTableKey.containsKey("MTM_DOCUMENT_VERSION")) {
            statment =(PreparedStatement)(Object) conn.prepareStatement("UPDATE SYS_TABLE_KEY SET TABLE_KEY_MAX=" + nMtmDocVersionID.toString() + " WHERE TABLE_NAME='MTM_DOCUMENT_VERSION'");
            statment.executeUpdate();
        } else {
            statment =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO SYS_TABLE_KEY VALUES('MTM_DOCUMENT_VERSION', " + nMtmDocVersionID.toString() + ")");
            statment.executeUpdate();
        }
        statment.close();
        System.out.println("final value: " + " DocumentID " + nDocID + " DocDetailID " + nDocDetailID + " DocVersion " + nVersionID + " DocContent " + nContentID + " nMtmDocVersionID " + nMtmDocVersionID);
        closeDBConn();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OP_MODE_INSERT;
public MyHelperClass setParentID(Integer o0){ return null; }
	public MyHelperClass setOwnerID(Integer o0){ return null; }
	public MyHelperClass setUpdateDate(MyHelperClass o0){ return null; }
	public MyHelperClass setItemSize(Integer o0){ return null; }
	public MyHelperClass setVersionLabel(String o0){ return null; }
	public MyHelperClass setReferenceNo(String o0){ return null; }
	public MyHelperClass setUserDefinedFieldID(Integer o0){ return null; }
	public MyHelperClass setUpdateCount(Integer o0){ return null; }
	public MyHelperClass getCreateDate(){ return null; }
	public MyHelperClass setUdfDetailList(ArrayList o0){ return null; }
	public MyHelperClass setRecordStatus(String o0){ return null; }
	public MyHelperClass setRootID(Integer o0){ return null; }
	public MyHelperClass setItemStatus(String o0){ return null; }
	public MyHelperClass setDocumentType(String o0){ return null; }
	public MyHelperClass setCreatorID(Integer o0){ return null; }
	public MyHelperClass setEffectiveStartDate(MyHelperClass o0){ return null; }
	public MyHelperClass getDocumentType(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setDocumentName(String o0){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass setVersionID(Integer o0){ return null; }
	public MyHelperClass setCreateType(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setCreateDate(MyHelperClass o0){ return null; }
	public MyHelperClass setUpdaterID(Integer o0){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass setContentID(Integer o0){ return null; }
	public MyHelperClass setID(Integer o0){ return null; }}

class LoadDocumentData {

}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SessionContainer {

}
