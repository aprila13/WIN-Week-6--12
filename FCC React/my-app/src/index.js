import React from 'react';
import ReactDOM from 'react-dom';

//Stateless functional component
//Always returns JSX. Something must always be returned
// function Greeting() {
//   return <h4>Hello</h4>
// }

//Functional component as an arrow function
//Using create element.  Pass in the element type, 
let Greeting = () => {
  //Tag type, empty props object, text
  return React.createElement('p', null, 'A paragraph')
}

//Using create element and nesting elements inside of each other
// let Greeting = () => {
//   return React.createElement('div', null, React.createElement(
//     'h1', null, 'Hello World'
//   ))
// }

console.log(Greeting)
ReactDOM.render(
  <Greeting />,
  document.getElementById('root')
);

