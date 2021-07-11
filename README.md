# Assignment #1

###Shelby Goudy, CS665 O2
####Wk 1 Assignment, 13 Jul 21

###Assumptions:
I imagined this to be a vending machine that has preset buttons, one for each type of drink offered (or something to 
that effect, could also contain a menu.) I wanted the user to be able to view the description and price of an 
item prior to purchasing, assuming there was no written menu external to the machine, and no person to answer their 
questions. Once the user decides on a drink, they make the selection and the process brews the drink automatically.
Upon completion, there is a completion message, as well as the option to add sugar and milk (with corresponding
messages). I did not include any interface for taking the users payment, though that would happen prior to brewing and
after selection.
All code is run inside TestVendingMachine. Code in Main can be run to see more details results if uncommented.

###Task 1: Implementation Description. (2 points )

**How flexible is your implementation, e.g., how you add or remove in future new drink types?**

This implementation follows the professors recommendation to create as many Classes as possible. I tried to
loosely couple items by creating each drink independent of the next. It's also built cohesively because right now
the machine only brews hot beverages, so I created that as an abstract class from which all of the drinks inherit
fields and methods. This allows for the addition of a section of cold beverages in the future. I had originally
separated out coffee and tea, and then instantiated objects from those, but found that the two classes were so
similar that I removed that altogether.


**How is the simplicity and understandability of your implementation?**

This code is very simple. The vending machine class instantiates the machine and also provides functionality. Through
it, the user can stock the machine, view info about a drink, and make a specific drink request (which creates the
drink). When a drink is created, the user can then (through the ICondiments interface) add sugar and/or milk. All
of the details of the drink are printed on the console so the user can see the price as well.


**How you avoided duplicated code?**

I did not intentionally use any design patterns, but I avoided duplicate as much as possible by creating a parent
abstract class (HotBev) and the ICondiment interface.

###Task 2: UML Class Diagram

![VM UML](https://github.com/metcs/met-cs665-assignment-1-sgoudy/blob/master/doc/VM_UML.png)

# How to compile the project

```mvn clean compile```

# How to create a binary runnable package 

```mvn clean compile assembly:single```

# How to run

```mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"```

# Run all the unit test classes.

```mvn clean compile test checkstyle:check  spotbugs:check```


# Using Spotbugs to find bugs in your project 

```mvn spotbugs:spotbugs```

```mvn spotbugs:check```

# Run Checkstyle 

```mvn checkstyle:check```