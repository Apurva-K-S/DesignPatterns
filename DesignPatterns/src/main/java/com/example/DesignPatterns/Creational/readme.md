# Singleton:
output:
1. first => com.example.DesignPatterns.Creational.Singleton@2d06cc67 
2. second => com.example.DesignPatterns.Creational.Singleton@2d06cc67

# Factory:
Definition: 
Defines an interface (contract) for creating an object, but lets subclasses decide which class to instantiate.
Key point: creating an object, we dont know how/why/or what parameters we are passing to create that object.

### When to use factory pattern:
1. Dynamic Object Creation: When the type of object to create isn’t known until runtime.
2. Create a general "blueprint" (an interface or abstract class) for the kind of object you want, without worrying about the exact type. 
Eg: A payment processing system where Payment is an interface, and the factory provides classes like CreditCardPayment, PayPalPayment, or BankTransferPayment
3. When designing libraries or frameworks to allow extensibility. 
Eg: FileLogger, ConsoleLogger, DatabaseLogger

### UseCases for Factory
1. Payment Processing System => PaymentFactory -> CreditCardPayment, PayPalPayment, BankTransferPayment
2. Notification System => NotificationFactory -> EmailNotification, SMSNotification, CallNotification
3. Delivery System => DeliveryFactory -> BikeDelivery, CarDelivery, AutoDelivery, SharedCabDelivery, DroneDelivery
4. Product System => CategoryFactory -> Fruits N Vegetables, Meat, Electronics, Apparel, Beauty 
5. SocialMedia System => PostFactory -> TextPost, ImagePost, VideoPost