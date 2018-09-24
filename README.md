# CSX42: Assignment 1
## Name: Matthew Lee

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in coursesRegistration/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile coursesRegistration/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile coursesRegistration/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile coursesRegistration/src/build.xml run -Darg0=<input_file.txt> -Darg1=<delete_file.txt> -Darg2=<output1_file.txt> -Darg3=<output2_file.txt> -Darg4=<output3_file.txt>

Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:

## Instruction to compile:
####Command: ant -buildfile courses/Registration/src/build.xml all

## Instruction to run:
####Command: ant -buildfile coursesRegistration/src/build.xml run -Darg0=$(pwd)/coursesRegistration/src/student_coursePrefs.txt -Darg1=$(pwd)/coursesRegistration/src/courseInfo.txt
####NOTE: output file path: ../matt_lee_assign1/coursesRegistration

## Choice of data structures:
#### List : List was used to hold the 'Student' and 'Course' objects. Having each student and course in an object made code overall more organized and easier to understand. Lists allowed for faster store times since it only had to push an object onto it instead of pushing onto multiple data structures.
#### Array : Used within the 'Student' class to hold the preferences. Array was used instead of list because number of preferences were known beforehand and it would save a little bit of space
####


-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 9/22/18


