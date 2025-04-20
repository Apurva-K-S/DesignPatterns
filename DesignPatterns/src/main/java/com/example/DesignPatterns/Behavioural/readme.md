## Chain of Responsibility
One request is passed on to multiple stages and each stage decides what needs to be done with the request and whether to send it to the next stage or not.
### When to use COR pattern:
1. Decoupling sender and receiver -> allowing the request to be processed by one or more handlers without the sender knowing who they are.
2. Processing Requests in a Sequence -> A request needs to be processed in a specific order by multiple handlers
3. Error Handling or Logging -> You want multiple layers of error handling or logging, with each layer deciding whether to log or escalate the issue. Try-catch
4. Extensibility -> You want to easily add or remove handlers without changing the client code.
### UseCases for Factory:
1. ATM Dispenser system: dispensing cash in denominations (50, 100, 200). Each handler corresponds to a specific denomination, request goes through chain until its fully processed.
2. Support Ticket Resolution System: escalation levels. if level 3 ticket is not resolved within specific time then it will escalate to level 2.
3. Approval/Appraisal workflow system: Manager, Team lead/principal engineer, Associate Director, Director, CTO.
4. Logger System: Debug -> Info -> Warn -> Error. Each handler logs a message if it matches or exceeds its severity level and passes it to the next handler.

## Observer Pattern
Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. 
In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.
### when to use observer pattern:
1. Event driven systems.
2. when observers change dynamically.
### Usecases for observer pattern:
1. Notification service: SMS, push, Email
2. Stock market ticker: Stock - subject, investor dashboards - observers.
3. Chat application: showing online/offline status - subject, contacts - observers.

## Strategy Pattern
explained in strategy_readme.md

## State Pattern
Object changes behaviour based on its internal state. Avoids massive if-else or switch-case chains.
### When to use state pattern?
### Usecases for state pattern:
1. Vending machine:
   1. States: Idle, HasMoney, Dispensing, OutOfStock 
   2. Behavior: Based on state, the same pressButton() may do totally different things.
2. Traffic light system:
   1. Light transitions (Red, Green, Yellow)
3. Jira Workflow:
   1. TRD started, TRD in progress, TRD in review, TRD completed, Dev started, Dev in progress, Dev completed etc.
   2. Each state has specific set of options and each state has different behaviour
4. Media player:
   1. different states - playingState, pausedState, StoppedState.
5. ATM machine:
   1. Behavior: Based on ATM state (HasCard, NoCard, HasPin, OutOfCash)
   2. State pattern avoids deep if-else logic for every ATM operation.
6. Online Order System 
   1. State Pattern manages: Order status lifecycle 
   2. States: Created, Paid, Shipped, Delivered, Cancelled