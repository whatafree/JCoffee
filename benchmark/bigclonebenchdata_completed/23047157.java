


class c23047157 {
public MyHelperClass ReadComplete;
	public MyHelperClass ClientCommand;

//        @Override
        public void run() {
            long timeout = 10 * 1000L;
            long start =(long)(Object) (new Date()).getTime();
            try {
                MyHelperClass socket = new MyHelperClass();
                InputStream is =(InputStream)(Object) socket.getInputStream();
                boolean available = false;
//                MyHelperClass socket = new MyHelperClass();
                while (!available && !(Boolean)(Object)socket.isClosed()) {
                    try {
                        if ((int)(Object)is.available() != 0) {
                            available = true;
                        } else {
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error("Error checking socket", e);
                    }
                    long curr =(long)(Object) (new Date()).getTime();
                    if ((curr - start) >= timeout) {
                        break;
                    }
                }
//                MyHelperClass socket = new MyHelperClass();
                if ((boolean)(Object)socket.isClosed()) {
                } else {
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(is, baos);
                    baos.flush();
                    baos.close();
                    MyHelperClass data = new MyHelperClass();
                    data = baos.toByteArray();
                }
                String msg =(int)(Object) ReadComplete.asString() + (int)(Object)ClientCommand.SP + "Read Complete" + ClientCommand.CRLF;
                List list =(List)(Object) new ArrayList();
                list.add(msg);
                ClientResponse response = new ClientResponse(list);
                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.notifyListeners(response);
            } catch (Exception e) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Error reading server response", e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SP;
	public MyHelperClass CRLF;
public MyHelperClass isClosed(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass notifyListeners(ClientResponse o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass asString(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class ClientResponse {

ClientResponse(){}
	ClientResponse(List o0){}}
