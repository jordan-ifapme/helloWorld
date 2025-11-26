package step.products;

import models.Product;
import step.StepResponse;
import step.Step;

import java.util.ArrayList;
import java.util.List;

public class UpdateCatalogStep implements Step<Product> {
    public UpdateCatalogStep() {
    }

    @Override
    public StepResponse<Product> execute(List<Product> input) {
        List<Product> updatedProducts = new ArrayList<>();
        System.out.println("Catalog has been updated");
        return new StepResponse<Product>(null, updatedProducts);
    }
}
