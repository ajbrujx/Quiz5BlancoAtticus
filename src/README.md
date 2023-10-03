# QUIZ 5

* Create a project in IntelliJ and name it Quiz5+lastname+first name (e.g. `Quiz5DoeJ`)

* Create a class in your Quiz5 project called `Quiz5` that has the following components:

  * **(1 point)** An instance variable named `sum` of type `int` and initialized to `0`.

  * **(1 pont)** An instance variable named `numberCount` of type `int` and initialized to `0`.

  * **(2 points)** A method named processNumber with a return type of void and a single parameter of type int. 

## The method should accomplish the following:
* Update the sum variable, by adding the number passed to the method to the instance variable, `sum`. Increment the instance variable `numberCount` by `1`.
  * **(3 points)** A method named `getInput` with a return type of `void` and no parameters that accomplishes the following:
    * Prompts the user for a number between 1 and 100 (inclusive).  Store the number entered in a variable.
    * Uses an `if` statement to validate the number is between `1` and `100`. If the number is not valid, output `Invalid number entered` to the terminal window and do not call `processNumber` as specified in the next step, 4.3 . Instead, use the `return` statement to terminate the method.
    * If the number is valid, call the method `processNumber` using the number entered and stored in the variable as the argument in the calling statement.
  * **(3 points)** A method named `showResults` with a return type of void and no parameters. The method should accomplish the following:
    * If `sum` and `numberCount` are not zero, their values should be output to the terminal window with appropriate labeling, otherwise the statement `sum and numberCount are both empty` should be output to the terminal window.
    * Save, zip and attach your complete project to this quiz question and submit to your instructor.

Projects that do not compile or are improperly packed will not be scored.
