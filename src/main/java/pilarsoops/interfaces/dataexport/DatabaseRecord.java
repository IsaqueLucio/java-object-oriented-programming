package interfaces.dataexport;

public class DatabaseRecord implements Exportable{
    
    private int recordId;
    private String data;

    public DatabaseRecord(int recordId, String data) {
        this.recordId = recordId;
        this.data = data;
    }

    @Override
    public String exportData(){
        return "\nDatabase Record\n{ 'id': " + recordId + ", \n'data': '" + data + "' }";
    }

    @Override
    public String toString() {
        return "DatabaseRecord [recordId=" + recordId + ", data=" + data + "]";
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    

}
