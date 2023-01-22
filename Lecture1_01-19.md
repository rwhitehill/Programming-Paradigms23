# Programming Paradigms - Lecture 1 (01/19/23)

A *paradigm* is a model or a framework for handling data 
* i.e. a specific style of writing software
* note: paradigms are **NOT** programming languages

In this class we cover: procedural and object-oriented paradigms (C++ and Java) as well as the functional (F#) and logic (SWI-Prolog) paradigms


### Procedural paradigm

a) When writing code for different programs, can create procedure and package code which can be utilized in those different programs instead of rewriting the code for each program

b) when handling large data items can input them, process, and output results all together instead of doing the steps independently for each data point

### Object-Oriented paradigm

This paradigm defines a set of procedures that can be applied to a particular type of data. OOP is about object, and objects can interact with each other to perform various tasks.

Benefits: 
1. reduces complexity of program
2. code is reusable

### Functional paradigm

In this paradigm, a program is a mathematical function. In this context, a function is a black box that maps a list of inputs to a list of outputs.
* we are not using commands and not following the memory state -> we have primitive functions that can be combined to compose a program or new function

Example program (F#):

````
    // procedural
    let add2 a = a+2
    let multiply3 a = a * 3
    let addAndMultiply a = 
        let sum = add2 a
        let product = multiply3 sum
        product

    printfn "%i%" (addAndMultiply 2)

    // functional
    let add2 a = a+2
    let multiply3 a = 3*a
    let addAndMultiply = add2 >> multiply3

    printfn "%i%" (addAndMultiply 2)
````

The primary goal of functional languages: minimize the use of mutable states
* everything is based on immutable data structures 
    * The more your code is based on immutable data types the more stable and robust it is

### Logic paradigm

This paradigm uses a set of facts and a set of rules to answer queries.

**Question**: So what programming paradigm is the best?  
**Answer**: It depends! There is no such thing as an absolute best paradigm. Each paradigm has a unique set of benefits and drawbacks, so which is best depends on the context and the problem to be solved.






