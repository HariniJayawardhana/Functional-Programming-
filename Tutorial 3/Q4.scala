object bookstore{
    def price(noOfBooks:Int):Double = noOfBooks*24.95;

    def discount(price:Double):Double = price*0.4;

    def shippingCosts(noOfBooks:Int):Double = (3*50) + ((noOfBooks-50)*0.75);

    def wholesaleCost(noOfBooks:Int):Double = price(noOfBooks) - discount(price(noOfBooks)) + shippingCosts(noOfBooks);

    def main(args: Array[String]):Unit = {
        println("Wholesale price = " ,price(60)-discount(price(60))+shippingCosts(60));
        println(wholesaleCost(60));
    } 
}