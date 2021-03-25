import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import StateCounter from './Components/StateCounter';
import ReduxCounter from './Components/ReduxCounter';


ReactDOM.render(
  <Provider>
    <ReduxCounter/>
  </Provider>,
  document.getElementById('root')
);


