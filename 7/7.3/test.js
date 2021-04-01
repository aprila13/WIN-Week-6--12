"use strict";
exports.__esModule = true;
var helloWorld = "Hello World";
console.log(helloWorld);
//**********INTERFACE//**********
//interface is a template of an object.  An interface defines an object's shape.
// interface User {
//   name: string;
//   id: number;
// }	
//user is a variable.  It is using the shape of User.
// const user: User = {
//   name: "April",
//   id: 1
// }
// console.log(user)
//Interface syntax:
// interface Name {
//   key: type;
// }
//Then set a variable as an object:
// const variableName: Name = {
// Key: Value
// }
//**********BOOLEAN//**********
// let completed: boolean = true;
// console.log(completed)
//Boolean Syntax:
// let variableName: boolean = value;
// if(completed == true) {
//   console.log('completed is true')
// }
//**********STRING//**********
// let car: string = 'Honda';
// console.log(car);
//String Syntax:
// let variableName: string = value;
//**********ARRAYS//**********
// let numArray: number[] = [5,4,6,6,8,1];
// console.log(numArray.sort())
//Note - You can still use JS methods
//Arrays can also be written as:
// let numArray: Array<number> = [1,2,3];
// console.log(numArray);
// let strArray: Array<string> = ["hello", "girl"];
// console.log(strArray);
// Array Syntax:
//let arrayName: type[] = values;
//let arrayName: Array<type> = values; 
//**********TUPLES//********** 
//An array with a fixed number of elements. Has different data types.
// let random: [number, string];
// random = [5, "hey!"];
// console.log(random);
//Tuple Syntax:
//Declaration --
//let variableName: [dataType, dataType];
//Initialization --
// variableName = [value, value];
//**********ENUMS//********** 
//Starts counting at 0 unless defined with a number
// enum Names {
//   April,
//   Jessica,
//   Stephanie = 10
// }
// let ladies: Names = Names.April;
// let bestie: Names = Names.Stephanie;
// console.log(ladies); //0
// console.log(bestie); //10
//Enums Syntax:
// Declaration of ENUM --
//enum Name {
//member
//member = optional number
// }
//Initialization of a variable holding an enum --
//let variableName: EnumName = EnumName.value;
//**********UNKNOWN//**********
//Can be any data type
// let random: unknown = 55;
// console.log(random);
// console.log(typeof random);
// random = 'I am a sentence.';
// console.log(random);
//Unknown Syntax:
//let variableName: unknown = value;
//**********ANY//**********
//Allows any data type
// let looselyTyped: any = 4;
// console.log(looselyTyped)
// console.log(typeof looselyTyped) recognizes the type
// looselyTyped = 'Some text';
// console.log(looselyTyped)
// console.log(typeof looselyTyped) recognizes the type
//Any Syntax:
//let variableName: any = value;
//**********VOID//**********
//Void is used in functions that do not return anything
// function warnUser(): void {
//   console.log("This is my warning message");
// }
// warnUser()
//**********NULL & UNDEFINED//**********
// Not much else we can assign to these variables!
// let u: undefined = undefined;
// let n: null = null;
var someValue = "this is a string";
var strLength = someValue.length;
console.log(strLength);
// variable: type = value/literal
