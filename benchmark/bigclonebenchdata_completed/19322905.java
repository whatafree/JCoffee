


class c19322905 {
public MyHelperClass assertThat(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass getResponse(HttpURLConnection o0){ return null; }
public MyHelperClass equalTo(String o0){ return null; }
	public MyHelperClass equalTo(int o0){ return null; }

//    @Test
    public void test_baseMaterialsForTypeID() throws Exception {
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + "/baseMaterialsForTypeID/587");
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("[{\"materialTypeID\":34,\"materialTypeName\":\"Tritanium\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"06_14\",\"materialVolume\":\"0.01\",\"quantity\":20524},{\"materialTypeID\":35,\"materialTypeName\":\"Pyerite\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"06_15\",\"materialVolume\":\"0.01\",\"quantity\":5529},{\"materialTypeID\":36,\"materialTypeName\":\"Mexallon\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"06_12\",\"materialVolume\":\"0.01\",\"quantity\":1841},{\"materialTypeID\":37,\"materialTypeName\":\"Isogen\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"06_16\",\"materialVolume\":\"0.01\",\"quantity\":317},{\"materialTypeID\":38,\"materialTypeName\":\"Nocxium\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"11_09\",\"materialVolume\":\"0.01\",\"quantity\":118},{\"materialTypeID\":39,\"materialTypeName\":\"Zydrine\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"11_11\",\"materialVolume\":\"0.01\",\"quantity\":13},{\"materialTypeID\":40,\"materialTypeName\":\"Megacyte\",\"materialTypeCategoryID\":4,\"materialTypeIcon\":\"11_10\",\"materialVolume\":\"0.01\",\"quantity\":1}]"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/json; charset=utf-8"));
        connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        assertThat(connection.getResponseCode(), equalTo(200));
        assertThat(getResponse(connection), equalTo("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><rowset><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>34</materialTypeID><materialTypeIcon>06_14</materialTypeIcon><materialTypeName>Tritanium</materialTypeName><materialVolume>0.01</materialVolume><quantity>20524</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>35</materialTypeID><materialTypeIcon>06_15</materialTypeIcon><materialTypeName>Pyerite</materialTypeName><materialVolume>0.01</materialVolume><quantity>5529</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>36</materialTypeID><materialTypeIcon>06_12</materialTypeIcon><materialTypeName>Mexallon</materialTypeName><materialVolume>0.01</materialVolume><quantity>1841</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>37</materialTypeID><materialTypeIcon>06_16</materialTypeIcon><materialTypeName>Isogen</materialTypeName><materialVolume>0.01</materialVolume><quantity>317</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>38</materialTypeID><materialTypeIcon>11_09</materialTypeIcon><materialTypeName>Nocxium</materialTypeName><materialVolume>0.01</materialVolume><quantity>118</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>39</materialTypeID><materialTypeIcon>11_11</materialTypeIcon><materialTypeName>Zydrine</materialTypeName><materialVolume>0.01</materialVolume><quantity>13</quantity></row><row xsi:type=\"invTypeMaterialDto\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><materialTypeCategoryID>4</materialTypeCategoryID><materialTypeID>40</materialTypeID><materialTypeIcon>11_10</materialTypeIcon><materialTypeName>Megacyte</materialTypeName><materialVolume>0.01</materialVolume><quantity>1</quantity></row></rowset>"));
        assertThat(connection.getHeaderField("Content-Type"), equalTo("application/xml; charset=utf-8"));
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
