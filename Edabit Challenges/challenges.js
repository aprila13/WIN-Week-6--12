//**Convert Age to Days
//Create a function that takes the age and return the age in days.
//Ex. calcAge(65) ➞ 23725

//As an arrow function
// let calcAge = (num) => {return num * 365}

//As a function declaration
// function calcAge(num) {
//   return num * 365;
// }
// console.log(calcAge(65))

//**Return Something to Me!
//Write a function that returns the string "something" joined with a space " " and the given argument a.
//giveMeSomething("Bob Jane") ➞ "something Bob Jane"

// let giveMeSomething = (x) => {return `Something ${x}`}

// function giveMeSomething(x){
// return `Something ${x}`
// }
// console.log(giveMeSomething("Bob Jane"))


//**Return the Remainder from Two Numbers
// There is a single operator in JavaScript, capable of providing the remainder of a division operation.Two numbers are passed as parameters.The first parameter divided by the second parameter will have a remainder, possibly zero.Return that value.
// Ex. remainder(3, 4) ➞ 3

// let remainder = (a, b) => {return a % b}
// console.log(remainder(3,4))

//**Maximum Edge of a Triangle
//Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
//Ex. nextEdge(8, 10) ➞ 17
// let nextEdge = (side1, side2) => {return (side1+ side2) -1}

// console.log(nextEdge(8,10))

//** Left Shift by Powers of Two
//The left shift operation is similar to multiplication by powers of two.
//-32 << 2 = -32 * 2^2 = -32 * 4 = -128
//Ex. shiftToLeft(-32, 2) ➞ -128

// function shiftToLeft(a, b) {
// return a * (b * b);
// }

// console.log(shiftToLeft(-32,2))

//**Find the Smallest and Biggest Numbers
//Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.
//Ex. minMax([1, 2, 3, 4, 5]) ➞ [1, 5]


function minMax(arr){
  let arrMax = Math.max(...arr);
  let arrMin = Math.min(...arr);
  let newArr = [];
  newArr.push(arrMin, arrMax)
  console.log(newArr)
}
minMax([1, 2, 3, 4, 5])