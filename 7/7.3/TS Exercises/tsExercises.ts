//https://typescript-exercises.github.io/#exercise=1&file=%2Findex.ts

//1. Given the data, define the interface "User" and use it accordingly.
//User interface.  Defines properties and types
// export interface User {
//     name: string;
//     age: number;
//     occupation: string;
// }

// //Variable called users
// //Type is User interface, but an array
// // =[{}] holds the value
// export const users: User[] = [
//     {
//         name: 'Max Mustermann',
//         age: 25,
//         occupation: 'Chimney sweep'
//     },
//     {
//         name: 'Kate Müller',
//         age: 23,
//         occupation: 'Astronaut'
//     }
// ];

// //Function called logPerson
// //user is the variable, I think.  It is of type User (interface).  Together it is the parameter.
// export function logPerson(user: User) {
//     console.log(` - ${user.name}, ${user.age}`);
// }

// console.log('Users:');
// users.forEach(logPerson);

//2.  Type "Person" is missing, please define it and use
    // it in persons array and logPerson function in order to fix
    // all the TS errors.

//User and Admin are interfaces.  Properties and their types are set.
// interface User {
//     name: string;
//     age: number;
//     occupation: string;
// }

// interface Admin {
//     name: string;
//     age: number;
//     role: string;
// }

// //I think Person is a type alias.  It is equal to User or Admin
// export type Person = User | Admin;

// //persons is a variable, type is an array named Person.  The rest is the value.
// export const persons: Person[] = [
//     {
//         name: 'Max Mustermann',
//         age: 25,
//         occupation: 'Chimney sweep'
//     },
//     {
//         name: 'Jane Doe',
//         age: 32,
//         role: 'Administrator'
//     },
//     {
//         name: 'Kate Müller',
//         age: 23,
//         occupation: 'Astronaut'
//     },
//     {
//         name: 'Bruce Willis',
//         age: 64,
//         role: 'World saver'
//     }
// ];

// //
// export function logPerson(user: Person) {
//     console.log(` - ${user.name}, ${user.age}`);
// }

// //persons is a variable that holds Person[]
// //For each item in the array, run logPerson()
// persons.forEach(logPerson);


//3. Fix type errors in logPerson function.
    // logPerson function should accept both User and Admin
    // and should output relevant information according to
    // the input: occupation for User and role for Admin.

// interface User {
//     name: string;
//     age: number;
//     occupation: string;
// }

// interface Admin {
//     name: string;
//     age: number;
//     role: string;
// }

// export type Person = User | Admin;

// export const persons: Person[] = [
//     {
//         name: 'Max Mustermann',
//         age: 25,
//         occupation: 'Chimney sweep'
//     },
//     {
//         name: 'Jane Doe',
//         age: 32,
//         role: 'Administrator'
//     },
//     {
//         name: 'Kate Müller',
//         age: 23,
//         occupation: 'Astronaut'
//     },
//     {
//         name: 'Bruce Willis',
//         age: 64,
//         role: 'World saver'
//     }
// ];

// export function logPerson(person: Person) {
//     let additionalInformation: string;
//     if ('role' in person) {
//         additionalInformation = person.role;
//     } else {
//         additionalInformation = person.occupation;
//     }
//     console.log(` - ${person.name}, ${person.age}, ${additionalInformation}`);
// }

// persons.forEach(logPerson);


//4. Figure out how to help TypeScript understand types in
    // this situation and apply necessary fixes.

//     interface User {
//     type: 'user';
//     name: string;
//     age: number;
//     occupation: string;
// }

// interface Admin {
//     type: 'admin';
//     name: string;
//     age: number;
//     role: string;
// }

// export type Person = User | Admin;

// export const persons: Person[] = [
//     { type: 'user', name: 'Max Mustermann', age: 25, occupation: 'Chimney sweep' },
//     { type: 'admin', name: 'Jane Doe', age: 32, role: 'Administrator' },
//     { type: 'user', name: 'Kate Müller', age: 23, occupation: 'Astronaut' },
//     { type: 'admin', name: 'Bruce Willis', age: 64, role: 'World saver' }
// ];

// export function isAdmin(person: Person): person is Admin {
//     return person.type === 'admin';
// }

// export function isUser(person: Person): person is User {
//     return person.type === 'user';
// }

// export function logPerson(person: Person) {
//     let additionalInformation: string = '';
//     if (isAdmin(person)) {
//         additionalInformation = person.role;
//     }
//     if (isUser(person)) {
//         additionalInformation = person.occupation;
//     }
//     console.log(` - ${person.name}, ${person.age}, ${additionalInformation}`);
// }

// console.log('Admins:');
// persons.filter(isAdmin).forEach(logPerson);

// console.log();

// console.log('Users:');
// persons.filter(isUser).forEach(logPerson);

//5. Exercise:
//     Without duplicating type structures, modify
//     filterUsers function definition so that we can
//     pass only those criteria which are needed,
//     and not the whole User information as it is
//     required now according to typing.

// Higher difficulty bonus exercise:

//     Exclude "type" from filter criterias.