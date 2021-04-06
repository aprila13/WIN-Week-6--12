import React from 'react';

const Button = ({ onClick = null, children = null}) => (
  <button onClick={onClick}> {children} </button>
);

export default Button

//This is a button which accepts an on click prompt