


class c15037259 {

    public void testJob() {
        try {
            URL url = new URL("http://rickysql.gotoip3.com/mapp/admin/admin.do");
            url.openConnection();
            url.getContent();
            System.out.print("00");
        } catch (Exception e) {
            System.out.print("Daily data update exception:" + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass openConnection(){ return null; }}
