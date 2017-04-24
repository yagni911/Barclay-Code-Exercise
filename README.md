# Barclaycard-Code-Exercise
JAVA programs are executed on windows 7 command prompt.

Set java path before executing java programs.


Unix script and commands are executed on Tutorialpoint BASH Shell Online Terminal.


FOR PROBLEM 1:

Java program for problem 1 is ServerStatus.java. 

Keep the files ServerStatus.java and SERVER_STATUS.txt in the same folder before executing the program.

Compile the program using following command on command prompt

javac ServerStatus.java

Run the program using following command on command prompt

java ServerStatus

The program will ask for the time interval in minutes that you want to set to check server status file(SERVER_STATUS.txt).

If you want to adjust the time interval, terminate the program and re-run it.


Example:

Input in SERVER_STATUS.txt file:

IVR 3/3 CRITICAL

EBS 1/3 OK


Output:

Press Ctrl+C anytime to terminate the program.

Enter the time interval in minutes to check server status: 5

RED Alert for IVR

AMBER Alert for EBS



FOR PROBLEM 2:

The script file for problem 2 is ServerStat.sh.

Keep the files ServerStat.sh and SERVER_STATUS.txt in the same folder before executing the script.

Also, in the file SERVER_STATUS.txt the cursor should be at the end of the last input line. There should not be any blank lines at the end of SERVER_STATUS.txt file for proper execution of the script.

Run the script using following command on terminal.

./ServerStat.sh


Example:

Input in SERVER_STATUS.txt file:

IVR 3/3 CRITICAL

EBS 1/3 OK


Output:

Press Ctrl+Z to terminate the execution of script.

Enter the time interval in minutes to check server status: 5

RED Alert for IVR

AMBER Alert for EBS



FOR PROBLEM 3:

The java program for problem 3 is SwapNumbers.java.

Compile the program using following command on command prompt

javac SwapNumbers.java

Run the program using following command on command prompt

java SwapNumbers

The program will ask for 2 integer input variables


Example:

Enter the value of a: 10

Enter the value of b: 20

value of a and b before swapping, a: 10 b: 20

value of a and b after swapping, a: 20 b: 10



FOR PROBLEM 4:

Problem 4 answer file contains the commands to be executed.

Run the given commands on unix terminal and the "Sample file.txt" should be in the folder from where the unix command is executed.
