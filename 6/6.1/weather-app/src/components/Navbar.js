import React, { Component } from 'react';
import Time from './Time'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

class Navbar extends Component {
  render() {
    return (
      <div>
        <div className="nav">
          <Link to="/">Home</Link> |
          <Link to="daily">Daily</Link> |
          <Link to="weekly">Weekly</Link>
        </div>
        
        <Time />
      </div>

    );
  }
}

export default Navbar