## Course Title: Design Patterns Lab
## Course Code: SWE4502
## Project Title: Racing In IUT

## Overview:
Racing In IUT is a Java-based skeleton of a single-player game where the player races against himself using a time tracker.

## Assumptions:
Instead of actually making a game, a skeleton of the game will be built using print functions. The assumptions are :
1. Instead of actually tracking the time, a random number generator is used to generate a
random number and convert it to HH::MM::SS format.
2. It's been assumed that the children of a Car class only shows the car information and the parent class
Car has start, stop and accelerate methods which contains only print functions and nothing
else. And this goes for every method of every parent or child class. This means not making an actual car or track.


## Key Features:
1. A player can choose a car from a category (Coupe, Roadster).
2. A player can tune the chosen car by selecting engines (V6, V8, V12) and turbocharger (Alpine, Cummins, Honeywell).
3. A player can choose a track to race (Blue Moon Bay Speedway, BB Raceway, Circuit de Spa-Francorchamps).
4. A player can choose different formats of racing (Sprint, Circuit).
5. A player can do racing.
6. A player can use the pit stop option to apply NOS (Sema, Resonac) to the car during the race.

## Implemented Patterns:
1. Singleton Pattern, which allows to create only a single instance to make sure that only a single player can race.
   
2. Strategy Pattern, which allows to choose a particular type of element dynamically at runtime to make sure that a player can choose from a collection of engines, turbochargers and use them interchangeably.
   
3. Factory Pattern, which allows us to create objects without
 exposing the creation logic to the client and refer to newly created objects using a common interface to ensure creating 3 tracks without exposing the creation logic to the player.

4. Abstract Factory Pattern, which provides an interface for creating families of related or dependent
 objects without specifying their concrete classes to create two categories of cars where each category has two types of car.

5. Decorator Pattern, which allows us to add additional responsibility to an object dynamically to add an extra functionally of
 NOS to our car object at run time.

6. Template Pattern, which allows subclasses redefine certain steps of an algorithm without changing the
 algorithm's structure to create a race method which has generalized steps of action we need to do to complete a race.


## Platforms & Technologies:
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
