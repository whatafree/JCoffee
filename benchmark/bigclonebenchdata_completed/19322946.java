


class c19322946 {
public MyHelperClass assertThat(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }
public MyHelperClass equalTo(String o0){ return null; }
	public MyHelperClass equalTo(int o0){ return null; }

//    @Test
    public void test_lookupType_FullSearch_MatchingWordInMiddle() throws Exception {
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + "/lookupType/cluster");
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("[{\"itemTypeID\":29055,\"itemCategoryID\":17,\"name\":\"Capital Gravimetric Sensor Cluster\",\"icon\":\"37_05\"},{\"itemTypeID\":29056,\"itemCategoryID\":9,\"name\":\"Capital Gravimetric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29065,\"itemCategoryID\":17,\"name\":\"Capital Ladar Sensor Cluster\",\"icon\":\"37_07\"},{\"itemTypeID\":29066,\"itemCategoryID\":9,\"name\":\"Capital Ladar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29069,\"itemCategoryID\":17,\"name\":\"Capital Magnetometric Sensor Cluster\",\"icon\":\"37_06\"},{\"itemTypeID\":29070,\"itemCategoryID\":9,\"name\":\"Capital Magnetometric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":29095,\"itemCategoryID\":17,\"name\":\"Capital Radar Sensor Cluster\",\"icon\":\"37_08\"},{\"itemTypeID\":29096,\"itemCategoryID\":9,\"name\":\"Capital Radar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":21013,\"itemCategoryID\":17,\"name\":\"Capital Sensor Cluster\",\"icon\":\"54_03\"},{\"itemTypeID\":21014,\"itemCategoryID\":9,\"name\":\"Capital Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":32241,\"itemCategoryID\":17,\"name\":\"Drive Cluster EDF-285\",\"icon\":\"24_11\"},{\"itemTypeID\":5279,\"itemCategoryID\":7,\"name\":\"F-23 Reciprocal Sensor Cluster Link\",\"icon\":\"03_09\",\"metaLevel\":4},{\"itemTypeID\":11534,\"itemCategoryID\":17,\"name\":\"Gravimetric Sensor Cluster\",\"icon\":\"37_05\"},{\"itemTypeID\":17340,\"itemCategoryID\":9,\"name\":\"Gravimetric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":11536,\"itemCategoryID\":17,\"name\":\"Ladar Sensor Cluster\",\"icon\":\"37_07\"},{\"itemTypeID\":17333,\"itemCategoryID\":9,\"name\":\"Ladar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":11535,\"itemCategoryID\":17,\"name\":\"Magnetometric Sensor Cluster\",\"icon\":\"37_06\"},{\"itemTypeID\":17345,\"itemCategoryID\":9,\"name\":\"Magnetometric Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":6218,\"itemCategoryID\":7,\"name\":\"Protected Gravimetric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":1},{\"itemTypeID\":6222,\"itemCategoryID\":7,\"name\":\"Protected LADAR Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":1},{\"itemTypeID\":6226,\"itemCategoryID\":7,\"name\":\"Protected Magnetometric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":1},{\"itemTypeID\":6230,\"itemCategoryID\":7,\"name\":\"Protected Multi-Frequency Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":1},{\"itemTypeID\":6234,\"itemCategoryID\":7,\"name\":\"Protected RADAR Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":1},{\"itemTypeID\":7895,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Gravimetric Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7893,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Ladar Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7914,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Magnetometric Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7896,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Omni Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":7892,\"itemCategoryID\":7,\"name\":\"Prototype ECCM I Radar Sensor Cluster\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":11537,\"itemCategoryID\":17,\"name\":\"Radar Sensor Cluster\",\"icon\":\"37_08\"},{\"itemTypeID\":17336,\"itemCategoryID\":9,\"name\":\"Radar Sensor Cluster Blueprint\",\"icon\":\"03_02\"},{\"itemTypeID\":6242,\"itemCategoryID\":7,\"name\":\"Sealed Gravimetric Backup Cluster\",\"icon\":\"04_10\",\"metaLevel\":0},{\"itemTypeID\":6241,\"itemCategoryID\":7,\"name\":\"Sealed LADAR Backup Cluster\",\"icon\":\"04_10\",\"metaLevel\":0},{\"itemTypeID\":6238,\"itemCategoryID\":7,\"name\":\"Sealed Magnetometric Backup Cluster\",\"icon\":\"04_10\",\"metaLevel\":0},{\"itemTypeID\":6239,\"itemCategoryID\":7,\"name\":\"Sealed Multi-Frequency Backup Cluster\",\"icon\":\"04_10\",\"metaLevel\":0},{\"itemTypeID\":6225,\"itemCategoryID\":7,\"name\":\"Sealed RADAR Backup Cluster\",\"icon\":\"04_10\",\"metaLevel\":0},{\"itemTypeID\":20238,\"itemCategoryID\":7,\"name\":\"Secure Gravimetric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":2},{\"itemTypeID\":20244,\"itemCategoryID\":7,\"name\":\"Secure Ladar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":2},{\"itemTypeID\":20250,\"itemCategoryID\":7,\"name\":\"Secure Magnetometric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":2},{\"itemTypeID\":20260,\"itemCategoryID\":7,\"name\":\"Secure Radar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":2},{\"itemTypeID\":20240,\"itemCategoryID\":7,\"name\":\"Shielded Gravimetric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":3},{\"itemTypeID\":20246,\"itemCategoryID\":7,\"name\":\"Shielded Ladar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":3},{\"itemTypeID\":20252,\"itemCategoryID\":7,\"name\":\"Shielded Magnetometric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":3},{\"itemTypeID\":20262,\"itemCategoryID\":7,\"name\":\"Shielded Radar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":3},{\"itemTypeID\":21722,\"itemCategoryID\":17,\"name\":\"Sleeper Nanite Cluster\",\"icon\":\"55_15\"},{\"itemTypeID\":20242,\"itemCategoryID\":7,\"name\":\"Warded Gravimetric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":20248,\"itemCategoryID\":7,\"name\":\"Warded Ladar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":20254,\"itemCategoryID\":7,\"name\":\"Warded Magnetometric Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":4},{\"itemTypeID\":20264,\"itemCategoryID\":7,\"name\":\"Warded Radar Backup Cluster I\",\"icon\":\"04_10\",\"metaLevel\":4}]"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Test {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
