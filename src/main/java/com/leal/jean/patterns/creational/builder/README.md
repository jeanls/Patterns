## Builder

##### What problem builder design pattern solves?

- Where instances are immutable
- Objects that need other objects or "parts" to construct them

##### What is a Builder?

- We have a complex process to construct an object involving multiples steps, the builder design pattern can help us
- In builder we remove the logic related to object construction from "client" code & abstract it in separate classes.

##### Example:

````java
class Product {
    public Product(int weight, double price, int qtd, int shipCode) {
        //initialize
    }
}
````
