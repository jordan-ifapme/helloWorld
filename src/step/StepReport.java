package step;

public class StepReport {
    private int treatedItems;
    private int filteredItems;
    private int erroredItems;

    public StepReport(int treatedItems, int filteredItems, int erroredItems) {
        this.treatedItems = treatedItems;
        this.filteredItems = filteredItems;
        this.erroredItems = erroredItems;
    }

    public StepReport() {
    }

    public int getTreatedItems() {
        return treatedItems;
    }

    public void setTreatedItems(int treatedItems) {
        this.treatedItems = treatedItems;
    }

    public int getFilteredItems() {
        return filteredItems;
    }

    public void setFilteredItems(int filteredItems) {
        this.filteredItems = filteredItems;
    }

    public int getErroredItems() {
        return erroredItems;
    }

    public void setErroredItems(int erroredItems) {
        this.erroredItems = erroredItems;
    }

    public void addToTreatedItems() {
        this.treatedItems ++;
    }

    public void addToFilteredItems() {
        this.filteredItems ++;
    }

    public void addToErroredItems() {
        this.erroredItems ++;
    }
}
