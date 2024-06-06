Java 8

    Topics to be Covered : 
    --------------------------------
    1 Introduction to Java
    2 Classes and Objects
    3 Methods, Encapsulation, and Conditionals
    4 Data Manipulation and Inheritance
    5 Encapsulation, Polymorphism, and Abstraction
    6 Interfaces, Lambda Expressions, Collections, and Generics
    7 Inheritance, Interfaces, Exceptions, and Deployment
    8 Date/Time API, I/O and File I/O (NIO.2), and Concurrency
    9 Concurrency, Parallelism, The JDBC API, and Localization

    Lab Setup

        JDK 8 or above.
        EClipse / IntelJ/ STS 
        Maven
        MySQL 8 community Server

    Intro

        History
            1.1, 
            1.2,1.3,1.4
            1.5
            1.8
            1.17
            1.21

        Features
            Simple
            Robust
            Multi-Threaded
            Distributed
            Self-Documented
            Platform Independent
            Archetecture Neutral

        Characteristics
            Partially but Srictly Object Oriented
            Type Safe
            Case Sensitive
            Has c-family syntax

        Tokens And Standards

            Identifiers
                variables names and method names
                    camelCase

                type names (classes, interfaces ..etcs)
                    InitialCapitals

                constants names
                    ALL_CAPITALS

            Keywords
            Operators
            Comments
            Literals
                "hello"         string literal
                '$'             char litral
                12              integer literal (decimals)
                034             integar literal (octal)
                0xA1            integer literal (hexa-decimal)
                12.56           floating point literal
                true , false    boolean lieterals
                null            null literal

    Object Oriented Programming Concepts

        Class and Object

            class is a user defined datatype. it is used to define
            a model with properties and behaviours. Properties are represented through variables called
            Fields and behaviours through Methods.

            Object is a variable of class type.

            class ComplexNumber{
                int real;
                int imaginary;

                ComplexNumber(){
                    /* is a default constructor - no arg constructor
                        is a special method that gets invoked as and when an object is allocated.
                        is used to initialize the fields of the object.
                    */

                    this(8,17);
                         //here 'this' keyword is used to call paramatrized-constructor from default construcotr
                }

                ComplexNumber(int real,int imaginary){
                    // a paramatrised constructor
                    this.real=real;
                    this.imaginary=imaginary;

                    //'this' keyword represents the current object.
                }

                ComplexNumber(ComplexNumber z){
                    // a copy constructor

                    this(z.real,z.imaginary); 
                         //here 'this' keyword is used to call paramatrized-constructor from copy constructor
                }
            }

            ComplexNumber z1 = new ComplexNumber();
            ComplexNumber z2 = new ComplexNumber(10,11);
            ComplexNumber z3 = new ComplexNumber(z2);
            ComplexNumber z4 = z2;

        Encapsulation

            is a means of appling restriction of access on fields or methods.

            This is done through access specifiers and setter and getters.

            Access Specifiers:
                <default>
                private
                protected
                public

            setter is a method that allows a value into a field (writing into a field)
            getter is a method that allows the value of field to be returned (reading a field).

            if a field is marked private, 
                we can make it both readable and writable by defining both setter and getter upon
                we can make it read only by defining only getter
                we can make it write only by defining only setter
            
            class ComplexNumber{
                private int real;
                private int imaginary;

                public ComplexNumber(){
                    this(8,17);
                }

                public ComplexNumber(int real,int imaginary){
                    this.real=real;
                    this.imaginary=imaginary;
                }

                public ComplexNumber(ComplexNumber z){
                    this(z.real,z.imaginary); 
                }

                public void setReal(int real){
                    this.rela=real;
                }

                public int getReal(){
                    return this.real;
                }

                //we are making the field 'imaginary' as read-only. (as a setter iw not defiend)
                public int getImaginary(){
                    return this.imaginary;
                }
            }

            'static'    keyword is used in various context

            static fields       a field is called a instance variable as each instacne (object) of the class has its own copy of the field
                                but if the field is marked static, it is called class variable, as it is allocated as a single copy for all instances (objects) to share.

            static methods      methods that are marked static can access only static fields and method of that class directly.

                                public static fields or methods can be accessed witht he class name directly.

            static classes      Inner Classes vs Nested Classes

            static blocks       static { /*some code goes here*/ }

        Polymorphisim

            is a technique to defien multiple methods with the same name.

            overloading
                two method of the same class or two methods from a super and a sub class
                    1. having same name
                    2. but different no.of.args or different types of arguments,
                are said to be overloaded.

                class Human{
                    
                    public void eat(Apple apple){
                        wash(apple);
                        ApplePieces[] pieces = cut(apple);
                        for(ApplePiece piece : pieces){
                            chewAndSwallow(piece);
                        }
                    }

                    public void eat(IceCream iceCream){
                        while(iceCream!=null){
                            lickAndSwallow(iceCream);
                        }
                    }
                }


            overrriding

                two methods from a super and a sub class, having the same signature (same name, same args
                and same return type) are said to be overridden

                class Monkey {
                    public void eat(Apple apple){
                        while(apple!=null){
                            biteAndChewAndSwallow(apple);
                        }
                    }
                }

                class Human extends Monkey {
                    public void eat(Apple apple){
                        wash(apple);
                        ApplePieces[] pieces = cut(apple);
                        for(ApplePiece piece : pieces){
                            chewAndSwallow(piece);
                        }
                    }
                }

        Inheretence

            is about defining a new class from an exsting class.

            class Pen {
                Nib nib;
                Barrel barrel;
                Rifill rifill;

                public void write(Paper paper){

                }
            }

            class Marker extends Pen {
                public void write(WhiteBoard board){

                }
            }

            Simple/Single
                            super <----------- sub
            MultLevel
                            super <----------- sub1 <----------- sub2 <----------- sub3
            
            Hirarchial
                                            | <----------- sub1 
                            super <---------|
                                            | <----------- sub2

            Multiple
                            super1 <---------|
                                             | <------- sub   
                            super2 <---------|

            Hybrid
                                            | <----------- sub1 
                            super <---------|
                                            | <----------- sub2 <----------- sub3 <----------- sub4


            Classes in Java do not support 'multiple' inheretnece .

            Constructors are chained from super to sub class, when am object of a sub-class is allocated.
            A reference of a super class can refer to an object of its class.

                SuperClass s = new SubClass();

            A Super class reference can be typecasted to a sub class reference.

                SubClass x = (Sub) s;

            'super' keyword can be used to invoke any super class constructor from a sub class constructor.

            'super' keyword can be used to invoke a super class method from its overriden copy in the sub-class.

                class SuperClass {
                    public void method(){
                        
                    }
                }
                
                class SubClass extends SuperClass {
                    public void method(){
                        super.method();       
                    }
                }

        Abstraction

            is the process of declaring and the implementaton follows later.

            abstract class
                    a class that can not have an object allocated.

                    abstract class Person                id,fullName,gender,bloodGroup
                            |
                            |-class Student               clazz,section,fee
                            |-class Teacher               subject,salary
                            |-class NonTeachingStaff      designation,salary
                            |-class Parent                mobileNumber,mailId

            abstract method
                    a method that is declared now but implementated later.
                    an abstract method can be declared only inside an abstract class or an interface.

                    abstract class Shape {
                        private int[] sides;

                        public int perimeter(){
                            int sum =0;
                            for(int s : sides){
                                sum += s;
                            }
                            return sum;
                        }

                        public abstact int area();
                    }

                    abstract classes when inherited, the inherting sub class must implement all the abstract methods
                    of the abstract super class, failing which - that sub class also must be marked as abstract.

            interface

                    is a user defiend abstract data type that can not have instacne-variable (non-static fields).
                    a class can implement multiple interfaces.

                    while defining an abstract data type....
                        if we have to declare fields -> no choice -> we write an abstract class
                        if we have no fields -> we choose interface over abstract class, as interface support multiple inheretence.

                   Classes represent Entities and Interfaces represent Roles.                     

                    interface Mother        giveBirth()
                    interface Father        protect(),feed()
                    interface Sibling       showAffectionAndLove()

                    abstract class Animal
                                    |- class FemaleAnimal       implements Mother,Sibling
                                    |- class MaleAnimal         implements Father,Sibling

                    abstract class Bird
                                    |- class FeMaleBird         implements Mother,Sibling
                                    |- class MaleBird           implements Father,Sibling

            'final' keyword

                final variables     are constants
                final methods       can not be overriden
                final classes       can not be inhereted furthur.

            'final' and 'abstract' keywords contradict each other and will never appear together.

            MarkerInterface         an interface having no methods at all is called a MarkerInterface

                                    java.io.Serializable

                                    Modernly MarkerInterfaces are repalced with Annotations.

            FunctionalInterface     an interface having only one abstract method is called a functional interface.

                                    interface BinaryOperator {
                                        int operate(int n1,int n2);
                                    }

                                    interface Greet{
                                        String doGreet(String unm);
                                    }

                                    interface GetText {
                                        String get();                                        
                                    }

                                    Functional interfaces can be implemented and instatiated without a class, using a special functional syntax called Lamdba Expression.

                                    A Lamdbda Expression 'maps' a list of parameters with its return value.

                                            (paramList) -> returnValue

                                                BinaryOperator sum = (a,b) -> a+b; 
                                                System.out.println(sum.operate(10,20));

                                                BinaryOperator maxOf =(x,y) -> x>y?x:y;
                                                System.out.println(maxOf.operate(10,20));

                                                Greet greet1 = userName -> "Hello "+userName;
                                                System.out.println(greet1.doGreet("Vamsy"));

                                                GetText companyName = () -> "Cognizant";
                                                System.out.println(companyName.get());

                                            (paramList) -> {
                                                //complex function body

                                                return someResult;
                                            };
                                    
                                    @FunctionalInterface is a compiler-check annotation
                                    that ensures that the interface has one and only avbstract method.

                                    Types of Functional Interfaces

                                    Suppliers       returns a value but has no-args.
                                    Consumers       doesnt't return any value but has args.    
                                    Predicates      returns boolean irrespective of having args.
                                    Functionals     any other than the above.

    java.lang
        Object          the defualt super class for all classes in java.
                        public boolean equals(Object)          // obj1.equals(obj2);
                        public int hashcode()
                        public String toString()

        System
        Math

        Byte
        Short
        Long
        Integer
        Float
        Double
        Boolean
        Void
        Character

        String
        StringBuffer
        StringBuilder

        Throwable
            |- Exception
                    |-RuntimeException
        
        Runnable
            |-Thread

    java.time
    java.util
    java.util.regex
    java.util.function
    java.util.stream
    java.io
    java.nio
    java.sql
