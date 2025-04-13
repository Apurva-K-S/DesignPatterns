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
5. 