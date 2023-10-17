You are tasked with implementing a feature in an e-commerce system that involves products, categories, customers, and orders. Here are the class relationships:
1. `Product` class has:
   - `productId`
   - `productName`
   - `category` (of type `Category`)

2. `Category` class has:
   - `categoryId`
   - `categoryName`

3. `Customer` class has:
   - `customerId`
   - `customerName`

4. `Order` class has:
   - `orderId`
   - `customer` (of type `Customer`)
   - `products` (a list of type `Product`)
   - `orderDate`


Your task is to write a Java method that takes a list of orders and returns a map that groups orders by category, where each category key is mapped to a list of customer names who ordered products from that category. Use Java Streams for this task.

Write a Java method with the following signature:

public static Map<Category, List<String>> groupCustomersByCategory(List<Order> orders) {
    // Your code here
}
