# Thread-Assignment
asks Implement the count method (line 5)
*Manage race condition so that the counting doesn't overlap 
*Print 'Done !' when both threads terminate

1) Implemented a counter that prints it's value and decreases each time when the loop is finished it will display "Finish" 
2) Used synchorinized to not make the counting overlap between the two threads
3) Used Join two each Thread to make sure the two Threads completes its execution 
4) Display "Done" when the two Threads completes its execution.
