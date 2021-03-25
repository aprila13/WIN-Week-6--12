import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
// import StateCounter from './Components/StateCounter';
import ReduxCounter from './Components/ReduxCounter';

const initialState = {
  count: 0
};

function reducer(state = initialState, action) {
  switch (action.type) {
    case 'INCREMENT':
      return {
        count: state.count + 1
      };
    case 'DECREMENT':
      return {
        count: state.count - 1
      };
    default:
      return state;
  }
}


const store = createStore(reducer);

ReactDOM.render(
    <Provider store={store}>
      <ReduxCounter />
    </Provider>,
  document.getElementById('root')
);


