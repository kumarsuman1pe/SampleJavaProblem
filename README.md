What is reentrant lock in java and how its better than synchronized block?

What is difference between cuncurrenecya and parallelism?

For threads and other concepts
https://www.youtube.com/@DefogTech/playlists

CQRS :https://www.youtube.com/watch?v=fzGZPf0FMao&ab_channel=JavaTechie

12 factor app?

CAP theorem

Requestbody and param 

https://serinryu.medium.com/spring-requestbody-vs-requestparam-78b1b433fc0c#:~:text=%40RequestBody%20is%20used%20to%20extract,URL%20or%20submitted%20form%20data.
https://g.co/gemini/share/cbe888668ef6


How do you handle exceptions in spring boots applicatons? 
https://medium.com/@bubu.tripathy/effective-exception-handling-6c0ce043d96f

WHat is difference between POST and PATCH http method?Here is a simple description of all:

      POST is always for creating a resource ( does not matter if it was duplicated )
      PUT is for checking if resource exists then update, else create new resource
      PATCH is always for updating a resource

How do you secure REST endpoint? Implents JWAT token and all.https://dzone.com/articles/json-web-token-how-to-secure-spring-boot-rest-api
      https://chat.openai.com/c/7429fc4d-e284-4d62-8643-77d3c74e9022

Spring @Controller and @RestController https://howtodoinjava.com/spring-boot2/rest/controller-restcontroller/

Spring @GetMapping and @PostMapping https://howtodoinjava.com/spring-mvc/controller-getmapping-postmapping/

Difference Between ApplicationContext and WebApplicationContext in Spring MVC https://www.geeksforgeeks.org/difference-between-applicationcontext-and-webapplicationcontext-in-spring-mvc/

Distributed logs: https://www.youtube.com/watch?v=XYvQHjWJJTE&ab_channel=ByteMonk[
](https://signoz.io/blog/distributed-tracing-in-microservices/)


Java8 memory management https://www.digitalocean.com/community/tutorials/java-jvm-memory-model-memory-management-in-java#java-jvm-memory-model

linkedlist cycle https://www.youtube.com/watch?v=QnDqtsU2VXY&ab_channel=CodeDecode


Demonstrate deadlock with working code https://www.youtube.com/watch?v=JLuFhNdmafc&ab_channel=SivaReddy
            
public class Deadlock {
    public static void main(String[] args) {
        final String resource1 = "resource1";
        final String resource2 = "resource2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

Can we create a constructor with a static keyword?

Why do we need the Synchronised with block and block level?

Write code .eqals and hashcode method


Publisher subscriber problem without using the Data structure?

How you use to store the password in the different tables by using the utility method so no need to write the same logic again and again in hpa(hint callback,, AOP)

How to handle a scenario where one service takes some time 1 sec and some time 15 min for response then how the decent service will be communicating?





What is a thread pool executor?

Types of TP executors?

What is a Marker interface? how can we create a marker interface? how can implement a marker interface without a body?            https://chat.openai.com/c/0f628501-68e9-4278-b7e9-c4860b29b769

Can we run a microservice without the @Sprinboot application?

Can we run the spring application without a Spring starter?

What is class level lock and object-level lock?

How do we exclude @enableAutoConfiguration?
https://www.baeldung.com/spring-componentscan-vs-enableautoconfiguration

What log level do we write for production?


What are the different ways of communicating for multiple microservice?
https://medium.com/design-microservices-architecture-with-patterns/microservices-communications-f319f8d76b71#:~:text=As%20you%20can%20see%20that,with%20using%20both%20communication%20types.


How do you secure microservice?

What are the MicroServices design patterns you used?

What is spring profile?

How you implemented Service discovery?

Write Curd operation for Employee with all annotation and Controller and path/query parameter?

What is use of @Transaction?

What is is @Qualifier?

What is 

How do you configured database in JPA?

What is Executor service?

What is difference between Collable and Runnable interface?

What is Sql dilect?

How do you handle Exception globally in spring boot?

What is difference between Static and default method?

What is try with resources?

How you generate the Jar in spring boot?



************************************** **Important concepts** **************************************

Serialization and deserialization in java

1. https://dzone.com/articles/what-is-serialization-everything-about-java-serial
2. https://www.studytonight.com/java/serialization-and-deserialization.php

Singleton Class
  https://dzone.com/articles/singleton-in-java

Immutable class in java
  https://dzone.com/articles/how-to-create-an-immutable-class-in-java

Why String is immutable in JAVA
1. https://www.journaldev.com/802/string-immutable-final-java
2. https://www.youtube.com/watch?v=Bj9Mx_Lx3q4

Pass by value OR pass by reference
https://initialcommit.com/blog/java-pass-reference-pass-value/


HashMap Internal Working
https://www.youtube.com/watch?v=c3RVW3KGIIE&t=1s

Comparable and Comparator in java
https://www.linkedin.com/pulse/understanding-java-garbage-collection-gc-policies-vinit-kumar/

https://www.softwaretestinghelp.com/java-comparable-and-comparator/

https://www.guru99.com/comparable-vs-comparator-java.html

https://www.youtube.com/watch?v=UwurUtvil7w&t=13s

Generic in java
https://www.youtube.com/watch?v=K1iu1kXkVoA

https://www.baeldung.com/java-generics#generic-methods


Collections Videos:
https://www.youtube.com/playlist?list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF

Garbage Collection in JAVA
https://www.youtube.com/watch?v=UnaNQgzw4zY&t=204s

JDK,JRE and JVM
https://dzone.com/articles/jvm-architecture-explained

JVM
https://dzone.com/articles/jvm-architecture-explained

https://www.youtube.com/watch?v=ZBJ0u9MaKtM&t=29s

https://mindscriptstech.com/jvm-architecture/

Java Memory management:

https://dzone.com/articles/java-memory-management#:~:text=Java%20has%20automatic%20memory%20management,they%20are%20not%20used%20anymore.

https://dzone.com/articles/understanding-the-java-memory-model-and-the-garbag

(Naveen Automation)

https://www.youtube.com/watch?v=4yKxJjYXZ0A

https://www.youtube.com/watch?v=aAjkJW08BGQ&t=243s



volatile keyword in java http://tutorials.jenkov.com/java-concurrency/volatile.html
Transient keyword in java https://www.geeksforgeeks.org/transient-keyword-java/

Different ways of creating object https://www.geeksforgeeks.org/different-ways-create-objects-java/

How to create your own Annotation?(Asked on Oracle and FICO) https://www.youtube.com/watch?v=DkZr7_c9ry8

**************************************** **Design Patterns** ***************************************************

**Creational Design Patterns:**

Builder Design patterns
https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

**Behavioural Design Patterns:**

State Design patterns
https://www.digitalocean.com/community/tutorials/state-design-pattern-java


https://www.youtube.com/watch?v=gw-XKtlEiEA

https://www.youtube.com/watch?v=QsBQnFUx388

https://www.youtube.com/watch?v=EdIwFK0gCm4&t=167s

Java concepts

https://www.youtube.com/c/CodingwithJohn

*********************************************************************************************************


*********************************************************************************************************
 
