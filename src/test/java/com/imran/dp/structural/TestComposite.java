package com.imran.dp.structural;

import com.imran.dp.structural.composite.Catalog;
import com.imran.dp.structural.composite.CatalogItem;
import com.imran.dp.structural.composite.Product;
import org.junit.Test;

public class TestComposite {

    @Test
    public void TestCatalogItem() {
        /*Create primary products for main catalog*/
        CatalogItem maleJeans = new Product("M: Jeans 32", 65.00);
        CatalogItem maleTShirt = new Product("M: T Shirt 38", 45.00);

        /*Create a composite product catalog and add female products to it*/
        CatalogItem  femaleCatalog = new Catalog("Female Products");
        CatalogItem femaleJeans = new Product("F: Jeans 32", 65.00);
        CatalogItem femaleTShirt = new Product("F: T Shirt 38", 45.00);
        femaleCatalog.add(femaleJeans);
        femaleCatalog.add(femaleTShirt);

        /*Create a composite product catalog and add kid products to it*/
        CatalogItem kidCatalog = new Catalog("Kids Products");
        CatalogItem kidShorts = new Product("Return Gift", 23.00);
        CatalogItem kidPlayGears = new Product("Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        /*Create primary catalog and add primary products and new catalogs to it*/
        CatalogItem mainCatalog = new Catalog("Primary Catalog");
        mainCatalog.add(maleJeans);
        mainCatalog.add(maleTShirt);
        mainCatalog.add(femaleCatalog);
        mainCatalog.add(kidCatalog);

        /*Print out product/catalog information*/
        mainCatalog.print();

    }
}
