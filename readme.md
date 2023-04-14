Task 1

Create a Person.class.

The Person class has one attribute:

-name (String)

The class should have one constructor to set the required attributes.

The class should have the toString() method implemented, returning:

name: {name}

Create an Employee.class. Employee inherits Person and in addition to having a name, every
Employee has:

- annual salary (double)

- National insurance number (String)

Employee.class should have a constructor setting all it’s attributes.

Employee should have toString() implemented as well, returning:

name: {name}, salary: {salary}, insurance number: {insurance number}

———————————————————————————————————————————
Task 2

2. 1. Create a class Vehicle.

Every vehicle has following attributes:

- speed (double)

- model (String)

It has 1 constructor accepting model, setting the attribute and speed to 0.0.

It has 3 methods:

accelerate(double) - increasing the speed by the provided parameter

decelerate(double) - reducing the speed by the provided number, or setting it to 0 if the difference
would be negative

toString() - returning: vehicle: {model}, speed: {speed}

2. 2. Create the class Engine.

Constructor accepts one argument setting the capacity.

Engine has 1 attribute:

- capacity (double)

Methods:

increaseCapacity(double) - increasing the capacity by the provided value

decreaseCapacity(double) - decreasing the capacity by the provided value

toString() - returning: capacity: {capacity}

2. 3. Create the classes DieselEngine and ElectricEngine which both inherit Engine

An Electric engine brakes recuperative, meaning it uses the braking force to charge the battery.
Implement a brake(double) method in a way that it increases the battery capacity like:

0.1 * brake speed
2. 4. Create two classes Car and ElectricCar which both inherit Vehicle.

In addition to the Vehicle attributes, every Car/ElectricCar has an Engine.

Car/ElectricCar class contractor accepts two attributes:

-model - setting the model

-capacity - setting the engine capacity

Car has always a DieselEngine and ElectricCar always an ElectricEngine of provided capacity.

Override the methods: accelerate(), decelerate() in the following way:

2.4.1. Car.class:

accelerate(double speed) - consumes 0.2. * speed amount of capacity/fuel

If the car does not have enough fuel, the method will not accelerate the car

2.4.2 ElectricCar.class

accelerate(double speed) - consumes 0.4. * speed amount of capacity/fuel

If the car does not have enough fuel, the method will not accelerate the car

decelerate(double speed) - will charge the engine capacity by the amount the car has reduced it’s
speed times (*) the factor 0.1

Both Car/ElectricCar class override toString returning:

vehicle: {model}, speed: {speed}, capacity: {capacity}

Important:
1. Pay attention to return types of methods. Use types that best fit the mentioned use
   cases. There are a couple of checks required by how much a car will accelerate or
   decelerate so help yourself and don’t make everything void.
2. Implement any additional helper methods you might find useful. I.e. particular getters or
   getterLike methods.
   There are a couple that could be useful to perform certain checks.
3. Ideally Car/ElectricCar do not know about the details of their Engines, so think about how
   you use the factors.