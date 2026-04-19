package collectionsframework.maps.ecommercecatalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog {
    
    private Map<String, List<String>> catalog = new HashMap<>();

    public void addProduct(String category, String product){
        if(category == null || product == null){
            System.out.println("A category and a product must to be inform!");
            return;
        }
        List<String> productList = catalog.get(category);
        if(productList == null){
            productList = new ArrayList<>();
            productList.add(product);
            System.out.println("\nThe new category "+category+" is now added to the list!");
            catalog.put(category, productList);
            System.out.println("Product "+product+" is now added to the catalog in the category "+category);    
        } else{
            productList.add(product);
            catalog.put(category , productList);
            System.out.println("\nProduct "+product+" is now added to the catalog in the category "+category);
        }
    }

    public void showProductsByCategory(String category){
        List<String> forSearchProducts = catalog.get(category);
        if(category ==  null || forSearchProducts == null){
            System.out.println("\nError: Category not found.");
        } else{
            System.out.println("\nProducts in the category "+category+":");
            for(String f: forSearchProducts){
                System.out.println(f);
            }
        }
    }
    
}
