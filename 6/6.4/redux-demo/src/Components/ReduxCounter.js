import React from 'react';
import { connect } from 'react-redux';


class ReduxCounter extends React.Component {
  increment = () => {
    // fill in later
  }

  decrement = () => {
    // fill in later
  }

  render() {
    return (
      <div>
        <h2>Counter</h2>
        <div>
          <button onClick={this.decrement}>-</button>
          <span>{this.props.count}</span>
          <button onClick={this.increment}>+</button>
        </div>
      </div>
    )
  }
}

// Add this function:
function mapStateToProps(state) {
  return {
    count: state.count
  };
}

// Replace 'export default Counter' with this:
export default connect(mapStateToProps)(ReduxCounter);