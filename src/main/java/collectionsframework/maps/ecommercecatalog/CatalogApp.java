package collectionsframework.maps.ecommercecatalog;

public class CatalogApp {
    public static void main(String[] args) {
        
        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct("Clothes", "HugoBoss T-Shirt");
        productCatalog.addProduct("Eletronic", "Samsung S25");
        productCatalog.addProduct("Drinks", "Whisky Jack Daniels");
        
        productCatalog.addProduct("Clothes", "Farm Red Dress");
        productCatalog.addProduct("Eletronic", "Xbox Series X");
        productCatalog.addProduct("Drinks", "Coca-Cola");
        productCatalog.addProduct("Clothes", "Hering Pants");
        productCatalog.addProduct("Eletronic", "Dell Alienware 18 Area-51");
        productCatalog.addProduct("Drinks", "Apple Juice");
        productCatalog.addProduct("Shoes", "Nike Air Max");

        productCatalog.addProduct(null, null);
        productCatalog.addProduct(null, "Test");
        productCatalog.addProduct("Test", null);

        productCatalog.showProductsByCategory("Eletronic");
        productCatalog.showProductsByCategory("Food");
        productCatalog.showProductsByCategory(null);


    }
}
