package step.products;

import models.Product;
import step.StepResponse;
import step.Step;
import step.StepReport;

import java.util.ArrayList;
import java.util.List;

public class RemoveOutOfStockStep implements Step<Product> {
    StepReport report = new StepReport();
    public RemoveOutOfStockStep() {
    }

    @Override
    public StepResponse<Product> execute(List<Product> input) {
        List<Product> inStockProducts = new ArrayList<>();
        for (Product prod : input) {
            if (prod.isInStock()){
                inStockProducts.add(prod);
            } else {
                report.addToFilteredItems();
            }
        }
        return new StepResponse<Product>(report, inStockProducts);
    }
}
