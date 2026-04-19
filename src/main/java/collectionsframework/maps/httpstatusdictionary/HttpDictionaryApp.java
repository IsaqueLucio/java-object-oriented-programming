package collectionsframework.maps.httpstatusdictionary;

public class HttpDictionaryApp {
    public static void main(String[] args) {
        
        HttpStatusDictionary httpStatusDictionary = new HttpStatusDictionary();

        httpStatusDictionary.addStatus(404, "Not Found");
        httpStatusDictionary.addStatus(200, "OK");
        httpStatusDictionary.addStatus(500, "Internal Server Error");
        
        httpStatusDictionary.addStatus(999, null);
        httpStatusDictionary.addStatus(null, "Test");

        httpStatusDictionary.lookUpStatus(200);
        httpStatusDictionary.lookUpStatus(300);
        httpStatusDictionary.lookUpStatus(999);
        httpStatusDictionary.lookUpStatus(null);

    }
}
