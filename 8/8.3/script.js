//Midterm Practice
// function valBetweenAlt(val, min, max) {
//   if (val > min) { //if val is greater than min, go to next if
//     if (val < max) { //if val is less than max
//       return val; //runs when both if's are true
//     } else return max; //only runs when second if is false
//   } else return min; //only runs when first if is false
// }
//                        //(val, min, max)
// console.log(valBetweenAlt(800, 0, 1000)) //800
// console.log(valBetweenAlt(80, 0, 20)) //20
// console.log(valBetweenAlt(-180, -100, -20)) //100


//https://www.w3resource.com/javascript-exercises/javascript-conditional-statements-and-loops-exercises.php#EDITOR

//1. Write a JavaScript program that accept two integers and display the larger
// function displayLarger(a, b) {
//   if (a > b) {
//     return `${a} is the larger number`;
//   } else {
//     return `${b} is the larger number`;
//   }
// }
// console.log(displayLarger(20, 30))
// console.log(displayLarger(250,30))

//2. Write a JavaScript conditional statement to find the sign of product of three numbers. Display an alert box with the specified sign
// function whatSign(a, b, c) {
//   let num = a * b * c;
//   if (num >= 0) {
//     alert("the sign is +");
//   } else {
//     alert("the sign is -");
//   }
// }
// whatSign(3, 7, 2)
// whatSign(3, -7, 2)

//3. Write a JavaScript conditional statement to sort three numbers. Display an alert box to show the result.

// function sortNums(){
//   let a = 0, b = -1, c = 4;
// } very lengthy, come back *********

//5. Write a JavaScript for loop that will iterate from 0 to 15. For each iteration, it will check if the current number is odd or even, and display a message to the screen.
// for(let i = 0; i <= 15; i++) {
//   if(i % 2 == 0){
//     console.log(`${i} is even`)
//   } else {
//     console.log(`${i} is odd`)
//   }
// }

//7. Write a JavaScript program which iterates the integers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
// function fizzBuzz() {
//   for (let i = 1; i <= 100; i++) {
//     if (i % 3 === 0 && i % 5 === 0) {
//       console.log("FizzBuzz")
//     } else if (i % 3 === 0) {
//       console.log("Fizz")
//     } else if (i % 5 === 0) {
//       console.log("Buzz")
//     } else {
//       console.log(i)
//     }
//   }
// }
// fizzBuzz()


//Closures
// function init(){
//   let name = 'April'; //local variable created by init
//   function displayName() { //inner function, closure
//     console.log(name); //using the parent's variable
//   }
//   displayName()
// }
// init()

// function cars(){
//   let make = 'Honda';

//   function showCars(){
//     console.log("The make of this cars is: " + make);
//   }
//   showCars()
// }
// cars()

// function calc(a){
//   function nums(b) {
//     console.log(a + b)
//   }
//   nums(4)
// }
// calc(6)

// let a = [2,1,3]
// console.log("Hello function!")

function makeInputVerifier(minimum, maximum) {
  return function verify(inputValue){
    if(inputValue < minimum) {
      return 'Input is less than minimum value';
    } else if (inputValue >= minimum && inputValue <= maximum) {
      return 'Input is in range';
    } else if (inputValue > maximum) {
      return 'Input is more than maximum value';
    }
  }
  console.log(verify(15));
}
makeInputVerifier(10, 20)

// function saySomething(x) {
//   console.log(x)
// }
// saySomething("Hello function!")

// function makeInputVerifier(minimum, maximum) {
//  return function verify(inputValue) {
//     if (inputValue < minimum) {
//       console.log('Input is less than minimum value');
//     } else if (inputValue >= minimum && input <= maximum) {
//       console.log('Input is in range');
//     } else {
//       console.log('Input is more than maximum value');
//     }
//   }
//    verify(5);
// }
// console.log(makeInputVerifier(10,20))