/*8) implement classes for the given scenario:
	- A reatail store which can store,edit,and delete 
multible products like fruits, vegetables, grocery, etc..
	- display the avilabe products like price, name, 
	quantity */
    
public class Main {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();
        store.addProduct("Apple", 1.0, 100);
        store.addProduct("Carrot", 0.5, 200);
        store.addProduct("Rice", 2.0, 50);

        System.out.println("\nAvailable Products:");
        store.displayProducts();
    }
}