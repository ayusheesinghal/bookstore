# bookstore

Java application that will solve the problem below. Given inputs of initial price, discount, floor price and budget it should return the number of books that can be purchased along with any remaining money after the purchase.



Build and Run Instructions
--------------
Install java
Update Java_Home 
Download and unzip BookStoreTest
cd BookStoreTest/src
compile from terminal : javac BooksPurchased.java Bookstore.java BookstoreMain.java
run from terminal : java BookstoreMain

Test Instructions
---------------
Test Framework used: Junit
For Windows : Set environment variable JUNIT_HOME to JUnit folder where JUnit jar is located 
For Mac : export JUNIT_HOME = /Library/JUNIT
compile from terminal : javac Bookstore_unitTest.java Bookstore_testRunnable.java 
run from terminal : java Bookstore_testRunnable

From Eclipse
Import Project : BookStoreTest
Add JUnit library in Build path -> configure build path -> add library -> (point to JUnit jar)
Run as Java Application -> BookstoreMain
Run as JUnit tests -> Bookstore_unitTest

Running Instructions
--------------
Solution is booksPurchased() method in Bookstore class.
Input Parameters : double initial, double discount, double floor, double budget
Return Type: object of BooksPurchased class (	int no_of_books_purchased, double remaining, String message )
The code can be run from the main method defined in the BookstoreMain.java or the booksPurchased method can be called from an object of Bookstore class defined in any other webservice/application.

Test cases coverage: 
1)Positive test
2)Empty input parameters test
3)Negative input parameters test
4)Edge cases test 
5)Invalid parameter values test

Further scope
------------
The books_bought_at_floor_price in booksPurchased() can be used to return the no. of books purchased at floor price.
Validation exceptions can be added for input parameters. Currently returned as message string in response
Test cases can be modified to check for expected validation exceptions.
