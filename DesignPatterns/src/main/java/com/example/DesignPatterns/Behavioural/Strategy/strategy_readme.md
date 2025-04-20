## Strategy Pattern
Also known as poly pattern. Define a family of algorithms, put each in its own class, and make them interchangeable at runtime.
### Difference between strategy and factory design patterns:
```
Feature         | Strategy Pattern                                      | Factory Pattern
--------------------------------------------------------------------------------------------------------------------------------
Purpose         | To choose and execute behavior (algorithm) at runtime | To create objects without exposing instantiation logic
Focus           | Encapsulation of behavior                             | Encapsulation of object creation
Output          | Executes a behavior                                   | Returns an object
Design Concern  | "How to do something"                                 | "Which object to create"
Common in       | Business logic, runtime decision-making               | Object creation logic, dependency injection
```
1. Both involve using interfaces and deciding at runtime, but what is getting decided at runtime differs.
2. In strategy pattern, which algorithm to use is decided at runtime.
3. In Factory pattern, which type of object to create is decided at runtime
### Usecases for Strategy pattern:
1. Payment mode in any app/shop -> 
Behaviour: paying money. card / upi / cash-on-delivery different modes of payments.
Creation of creditcard/debit card/ upi code
2. Moves in Chess game -> 
behaviour: movement of piece. Move strategy - King move, Queen move, bishop move, knight move, rook move, pawn move - strategy pattern
Creation of king/queen/bishop/knight/rook/pawn - factory pattern
3. Sorting algorithms -> 
behaviour: sort. merge, bubble, etc. - strategy
Creation of merge class/bubble class etc - factory
4. Compression algorithm -> 
behaviour: compress. Gzip, lz4, zstd. - strategy
creation of gzip, lz4, zstd - factory



### what about mode of transport - cab, auto, car,  in uber like apps ? these are factory (creation) or strategy (behaviour) ?
```
Concern                                                 | Pattern Type          | Why?
--------------------------------------------------------------------------------------------------------------------------------------------------------
Choosing a transport mode (cab, auto, bike)             | ✅ Strategy Pattern   | Different ways of fulfilling the same "transport" behavior
Creating an instance of vehicle type (Car, Auto, Bike)  | ✅ Factory Pattern    | You don’t want to expose the new Cab() or new Auto() logic everywhere
```
1. Strategy Pattern – Choosing How to Transport:
   1. You define a common interface like TransportStrategy:
   2. then implement it for:
      1. CabTransportStrategy 
      2. AutoTransportStrategy 
      3. BikeTransportStrategy.

   This is behavior-focused. It's a Strategy Pattern.
2. Factory Pattern – Creating the Right Transport Object
```
public class TransportFactory {
    public static Transport getTransport(String type) {
        return switch(type) {
            case "cab" -> new Cab();
            case "bike" -> new Bike();
            case "auto" -> new Auto();
            default -> throw new IllegalArgumentException("Unknown transport");
        };
    }
}
You may not want to let the app code call new Cab() or new Bike() everywhere. So, you'd use:
```
This is object-creation focused. It's a Factory Pattern.

```
Strategy is about how to carry a customer (bike, cab, etc.).
Factory is about how to get the right vehicle for that strategy.
```

Example: so between A to B, if i decide to go by auto then strategy pattern invokes auto mode of transportation and factory creates Auto object on runtime

✅ Scenario: Go from A to B in an Uber-like app

👣 Step-by-step:
1. User selects "Auto" as their preferred mode of transport. 
2. Your app (maybe a RideBookingManager) decides:
   1. “I need to transport the user using the Auto strategy.” 
   2. This is where Strategy Pattern kicks in — you dynamically decide how the transport should behave.

3. To perform the ride, you need an actual Auto object:
   1. This is where Factory Pattern comes in — it creates the correct object for the selected strategy at runtime.

### Important Conclusion:
🔥 Wherever there's Strategy, there's almost always a Factory close by — because:

Strategy = How to do something (behavior)

Factory = What object to use for that behavior (creation)

```why "almost always"? why not always ? what are those edge cases?```

You don’t always need a Factory with a Strategy if:
1. You already have all strategies available and initialized, You aren’t dynamically creating them at runtime, Or you're using dependency injection to inject them
   1. Like for person A - auto is fixed no need to decide at runtime. 
   2. so auto strategy is chosen statically. 
   3. no need for factory, we have pre-defined strategy
