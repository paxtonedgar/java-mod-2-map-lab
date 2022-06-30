import java.util.HashMap;
import java.util.LinkedList;

public class Library {
    HashMap<String, LinkedList<Object>> catalog = new  HashMap<String, LinkedList<Object>>();

    public HashMap<String, LinkedList<Object>> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<String, LinkedList<Object>> catalog) {
        this.catalog = catalog;
    }

    public void addCatalog(LinkedList<Object> bookEntry) {
        Object Title = bookEntry.pop(); 
        this.catalog.put(Title.toString(), bookEntry); 
    } 
    public void printCatalog() {
        for (String name: catalog.keySet()) {
            String key = name.toString();
            String value = catalog.get(name).toString();
            System.out.println(key + " " + value);
        }

    }    

    
}
