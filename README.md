# Simple-Warehouse
Simple warehouse structure used to practice Super and Sub class fundamentals.


Main program code:
ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
juice.takeFromWarehouse(11.3);
juice.addToWarehouse(1.0);
//current warehouse history values: [1000.0, 988.7, 989.7]

juice.printAnalysis();

Output:
Product: Juice
History: [1000.0, 988.7, 989.7]
Largest amount of product: 1000.0
Smallest amount of product: 988.7
Average: 992.8
