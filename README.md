# Intro_to_Java_Programming_Course
This repository contains solutions that I wrote to examples to school homework problems. Examples come from "Starting Out with Java: From Control Structures through Objects" by Tony Gaddis, or MyProgrammingLab.com.


employee.java: Focuses on learning how to write a class, getters/setters in the class, and instantiating an object of said class in order to manipulate and access data.
- I found this assignment to be very beneficial as it does a great job at showcasing the power of abstraction. Abstraction and the whole idea of writing classes, methods, and 
  using objects to manipulate/access data became a lot clearer and easier to understand upon completion of this assignment.

rainfall.java: Incorporates the use of arrays into the creation of classes, methods, and using these methods.
  -I struggled with this assignment for quite awhile, but in the process learned how to overcome many issues with writing classes, using arrays, and validating user input.

  -One obstacle that I encountered was an error during input validation of user-inputted doubles, "Exception in thread "main" java.util.NoSuchElementException." This was 
   a result of how I was trying to take the information from the user and proceed to the next iteration of the while loop. I was using .nextDouble(), followed by .nextLine() (to
   remove the \n character at the end of each line), but this kept giving me the error above. After much research, I stumbled upon the convention of storing the input as a string
   and subsequently parsing the double from that string, which by default would remove any excess characters from the previous line. This resolved the issue and serves as a much 
   needed learning point for making my input validation far simpler in the future.

  -Honestly, I figured this assignment would be very straight forward, but with the amount of obstacles that I encountered and was forced to work myself out of,
   I feel much more comfortable writing Java classes and Java code in general. This showed me that even simple assignments can lead to issues if you are not 100% comfortable
   with the content being taught. This reinforced my understanding of the presented concepts, as well as introduced me to other conventions to improve future projects.
