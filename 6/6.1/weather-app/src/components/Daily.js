import React, { Component } from 'react'

export default class Daily extends Component {
  constructor() {
    super();
    this.state = {
      location: ['Yakutsk, Sakha Republic, Russia', 'Mecca, Saudi Arabia', 'Great Falls, MT', 'Tórshavn, Faroe Islands', 'San Pedro de Atacama, Chile'],
      temp: ['-20', 98, 36, 47, 58],
      precip: ['2%', '0%', '0%', '54%', '0%'],
      wind: ['4MPH', '11MPH', '17MPH', '10MPH', '7MPH']
    }
  }

  render() {
    return (
      <div>
        <div>
        <h3>{this.state.location[0]}</h3>
          <p>Temp: {this.state.temp[0]}</p>
          <p>Precipitation: {this.state.precip[0]}</p>
          <p>Wind: {this.state.wind[0]}</p>
      </div>

        <div>
          <h3>{this.state.location[1]}</h3>
          <p>Temp: {this.state.temp[1]}</p>
          <p>Precipitation: {this.state.precip[1]}</p>
          <p>Wind: {this.state.wind[1]}</p>
        </div>

        <div>
          <h3>{this.state.location[2]}</h3>
          <p>Temp: {this.state.temp[2]}</p>
          <p>Precipitation: {this.state.precip[2]}</p>
          <p>Wind: {this.state.wind[2]}</p>
        </div>

        <div>
          <h3>{this.state.location[3]}</h3>
          <p>Temp: {this.state.temp[3]}</p>
          <p>Precipitation: {this.state.precip[3]}</p>
          <p>Wind: {this.state.wind[3]}</p>
        </div>

        <div>
          <h3>{this.state.location[4]}</h3>
          <p>Temp: {this.state.temp[4]}</p>
          <p>Precipitation: {this.state.precip[4]}</p>
          <p>Wind: {this.state.wind[4]}</p>
        </div>

      </div>
      
    )
  }
}

// const hidden = {
//   visibility: 'hidden'
// }