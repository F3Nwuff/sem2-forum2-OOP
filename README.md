# OOP 2nd sem Forum 2 Answers
1.a ) Class is a blueprint or template to create individual objects that define attributes and behaviours that characterizes the object.
instances of a class is the object created by the class that can be manipulated and interacted with.
an example is the class calcTotalSales and the instance is the salesHistory.

1.b )
1) Inheritance of the products of the sales person, inside of it could have the type and amount of items that the salesperson has ready. we could use a hierarchy where the base could be called "inventory" and inside of it could be sub-classes such as "food", "machines", etc. and inside would be the products related to the sub-class name and the amount ready.
2) Inheritance of the authentication, it could have the username and password of a certain salesperson that could unlock their information or details, and another for clients to be able to see certain products.we could use a hierarchy where the base is "Identification" with sub-class "employee" and "client", where each has their own username, password, and available/accessible information.

1.c ) libraries are a collection of already pre-written codes which has a lot of already very good functions, which makes it much faster and more efficient than writing the functions and also saves space. 

2.a ) done - Inside SalesPerson.java

2.b ) to keep the objects inside of it private or protected (limited access, and cannot be changed externally, so it must use methods to access it)

2.c.i )

![sem2forum2.png](..%2Fsem2forum2.png)

2.c.ii ) compatibility issues, and error inputs because any changes in sales would also need to be changed in salesperson because it is dependant on objects in sales.

2.d ) the output is :

102

2

2550.4

5000.0

2.e ) done - Inside SalesPerson.java

2.f ) done - Inside Driver.java

2.g ) done - Inside Driver.java

2.h ) add variable to store salary and sales, add setter and getter method for salary and sales, add method to calculate the salary and sales or modify calcTotalSales function in SalesPerson class.

2.i ) the polymorphism form in the classes is overloading, because there are 2 constructors in SalesPerson Class
