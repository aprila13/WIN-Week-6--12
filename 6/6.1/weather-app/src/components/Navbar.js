import React, { Component } from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";

class Navbar extends Component {
  render() {
    return (
      <div className="nav">
        <Link to="/">Home</Link> |
        <Link to="daily">Daily</Link> |
        <Link to="weekly">Weekly</Link>
      </div>
    );
  }
}

export default Navbar