# Programming Paradigms - Lecture 8 (02/16/23)

looping over list and incrementing variable
````F#

let list1 : int list = [1;2;3;4;5;6]

let mutable count : int = 0;
for _ in list1 do
    count <- count + 1

printfn "The total number of elements in list1: %d" count

````

guessing game (while loop practice): guess numbers until you get the magic number
````F#

let mutable quit : bool = false
let num : int = 11
while not quit do
    printfn "Guess a number: "
    let guess : string = System.Console.ReadLine()
    let guessNum : int = int guess
    if guessNum = num then
        quit <- true
        printfn "You guessed correctly %i is the secret number " num
    else
        printfn "%i is incorrect. The secret number is in the range of (10 to 20)" guessNum

````
