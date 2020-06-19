


class c8330064 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass defaultUdpPort;
	public MyHelperClass defaultUdpAddress;
	public MyHelperClass JCFS;
	public MyHelperClass dir;
	public MyHelperClass defaultTcpAddress;
public MyHelperClass assertEquals(int o0, int o1){ return null; }
	public MyHelperClass assertEquals(String o0, String o1){ return null; }

//    @Test
    public void testWriteAndReadBigger() throws Exception {
        MyHelperClass defaultTcpPort = new MyHelperClass();
        JCFSFileServer server = new JCFSFileServer(defaultTcpPort, defaultTcpAddress, defaultUdpPort, defaultUdpAddress, dir, 0, 0);
        MyHelperClass defaultUdpAddress = new MyHelperClass();
        JCFS.configureDiscovery(defaultUdpAddress, defaultUdpPort);
        try {
            server.start();
            RFile file = new RFile("testreadwrite.txt");
            RFileOutputStream out = new RFileOutputStream(file);
            String body = "";
            int size = 50 * 1024;
            for (int i = 0; i < size; i++) {
                body = body + "a";
            }
            out.write(body.getBytes("utf-8"));
            out.close();
            MyHelperClass dir = new MyHelperClass();
            File expected = new File(dir, "testreadwrite.txt");
            assertTrue(expected.isFile());
            assertEquals(body.length(),(int)(Object) expected.length());
            RFileInputStream in = new RFileInputStream(file);
            byte[] buffer = new byte[body.length()];
            int readCount =(int)(Object) in.read(buffer);
            in.close();
            assertEquals(body.length(), readCount);
            String resultRead = new String(buffer, "utf-8");
            assertEquals(body, resultRead);
        } finally {
            server.stop();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass configureDiscovery(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Test {

}

class JCFSFileServer {

JCFSFileServer(){}
	JCFSFileServer(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, int o5, int o6){}
	public MyHelperClass stop(){ return null; }
	public MyHelperClass start(){ return null; }}

class RFile {

RFile(String o0){}
	RFile(){}}

class RFileOutputStream {

RFileOutputStream(RFile o0){}
	RFileOutputStream(){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass length(){ return null; }}

class RFileInputStream {

RFileInputStream(RFile o0){}
	RFileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
