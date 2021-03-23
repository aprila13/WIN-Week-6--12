import React, { Component } from 'react';
import Home from './Home'
import Daily from './Daily'
import Weekly from './Weekly'
import Navbar from './Navbar'
import Wireframe from './Wireframe'
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";


class Routes extends Component {
  render() {
    return (
      <Router>
        <div>
          <Navbar />
          <Route name="Home" exact path="/" component={Home} />
          <Route name="Daily" path="/daily" component={Daily} />
          <Route name="Weekly" path="/weekly" component={Weekly} />
          <Route name="Wireframe" path="/wireframe" component={Wireframe} />
        </div>
      </Router>
    );
  }
}

export default Routes