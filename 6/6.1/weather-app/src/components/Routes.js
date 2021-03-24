import React, { Component } from 'react';
import Home from './Home'
import Daily from './Daily'
import Weekly from './Weekly'
import Navbar from './Navbar'
import Wireframe from './Wireframe'
import Slide from './Slide'
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
          <Route name="Wireframe" path="/wireframe" component={Wireframe} />
          <Route name="Slide" path="/slide" component={Slide} />
          <Route name="Home" exact path="/" component={Home} />
          <Route name="Daily" path="/daily" component={Daily} />
          <Route name="Weekly" path="/weekly" component={Weekly} />
          
        </div>
      </Router>
    );
  }
}

export default Routes