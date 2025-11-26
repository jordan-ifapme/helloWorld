package step.products;

import models.Product;
import step.StepResponse;
import step.Step;
import step.StepReport;

import java.util.List;

public class ApplyDiscountStep implements Step<Product>{
    StepReport report = new StepReport();
    public ApplyDiscountStep() {
    }

    @Override
    public StepResponse<Product> execute(List<Product> input) {
      input.stream().filter(prod -> prod.getDiscountPercentage() != 0).forEach(prod -> {
        prod.setPrice(prod.getPrice() * (1 - (double) prod.getDiscountPercentage() / 100));
        prod.setDiscountPercentage(0);
        report.addToTreatedItems();
      });
        return new StepResponse<Product>(report, input);
    }
}
