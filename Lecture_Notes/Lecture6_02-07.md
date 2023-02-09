# Programming Paradigms - Lecture 6 (02/07/23)

### Learning to use F\#

F# is primarily a functional programming language (supports some OOP and procedural but not as good as C++, python, java, etc.)
* lightweight
* by default, all variables are immutable 
    * must explicitly declare that variable is mutable by using `mutable` keyword in variable declaration (use `var <- something` to set new value)
* powerful data types: represent complex data & model domains using tuples, records, and discriminated unions
* pattern matching: enforce correctness in application's behavior using compiler
* variable types are inferred by compiler when not explicitly stated

declare number variable: `let number = 20`  
declare string variable: `let str = "Whitehill"`
declare list collection: `let items = [1; 2; 3; 4; 5]`
* append list: `let list = List.append items [6]` (note: since items above is not mutable we have to append and save to new list)


