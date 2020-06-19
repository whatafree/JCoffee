


class c23147989 {

    public boolean copy(String file, String path) {
        try {
            File file_in = new File(file);
            String tmp1, tmp2;
            tmp1 = file;
            tmp2 = path;
            while (tmp2.contains("\\")) {
                tmp2 = tmp2.substring(tmp2.indexOf("\\") + 1);
                tmp1 = tmp1.substring(tmp1.indexOf("\\") + 1);
            }
            tmp1 = file.substring(0, file.length() - tmp1.length()) + tmp2 + tmp1.substring(tmp1.indexOf("\\"));
            File file_out = new File(tmp1);
            File parent =(File)(Object) file_out.getParentFile();
            parent.mkdirs();
            FileInputStream in1 = new FileInputStream(file_in);
            FileOutputStream out1 = new FileOutputStream(file_out);
            byte[] bytes = new byte[1024];
            int c;
            while ((c =(int)(Object) in1.read(bytes)) != -1) out1.write(bytes, 0, c);
            in1.close();
            out1.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
