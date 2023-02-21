
Calculator program (procedural)
````F#

[<EntryPoint>]
let main argv: string[] = 
    printfn "Welcome to the calculator program"
    Console.WriteLIne "Type the first integer: "
    let firstNumber : string = System.Console.ReadLine()
    printfn "Type the second number:"
    let secondNumber : string = System.Console.ReadLine()
    printfn "First %s, Second %s" firstNumber,secondNumber

    let sum : int = (int firstNumber) + (int secondNumber)
    let multiple : int = (int firstNumber) * (int secondNumber)
    printfn "The sum is %i" sum
    printfn "The multiple is %i" multiple

````

````F#
let performCalculation operation : string (operand1:float) (operand2:float)
    match operation with
        "+" -> operand1 + operand2
        "-" -> operand1 - operand2
        "*" -> operand1 * operand2
        "/" -> operand1 / operand2
        _   -> failwith message = "Invalid operation"

let rec readOperand() = 
    System.Console.WriteLine("Enter an operand: ")
    let input : string = System.Console.ReadLine()
    match System.Double.TryParse input with
        true, value : float ->  value
        false, _ ->
            System.Console.WriteLine("Invalid input, please try again.")
            readOperand()

let rec readOperation () = 
    System.Console.WriteLine("Enter operation (+, -, *, /): ")
    let operation : string = System.Console.ReadLine().[]/ToString()
    match operation with
        | "+" | "-" | "*" | "/" -> operation
        | - -> readOperation()

[<EntryPoint>]
let main argv : string[]
    System.Console.Write("")

````

**Recursion** is a technique in which a function calls itself to solve a problem.
* F# supports recursive functions

````F#

printfn "Please enter a positive integer:"
let input : string = System.Console.ReadLine()
let number : int = int input
let result : string = 
    if   number % 3 = 0 && number % 5 = 0 then "FizzBuzz"
    elif number % 3 = 0 then "Fizz"
    elif number % 5 = 0 then "Buzz"
    else number.ToString()

printfn "%s" result

````


