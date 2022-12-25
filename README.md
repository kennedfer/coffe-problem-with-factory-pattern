# Coffe problem with Factory Pattern
## Factory pattern to solve coffe problem
### The Problem:
In a coffee shop app, whenever we have to add a new cafe we need to code at least one new constructor.
### The Solution:
With the Factory Pattern we can just add another item to Enum. This give more developement speed and avoid some sintaxe erros 

*ps: a new class has yet to be written but all the logic of new CoffeeType() (e.g. new Express()) can be summarized and the check with the switch removed using the Supplier*
