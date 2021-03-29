import React, {Component} from "react"
import People from "./People"
class App extends Component {
  constructor() {
      super()
      this.state = {
          book: {},
          people: {}
      }
  }
componentDidMount() {
  fetch("https://openlibrary.org/works/OL45883W.json")
    .then(response => response.json())
    .then(data => {
      this.setState({
        book: data,
        people: data.subject_people
      })
    })
}
render() {
    return (
        <div>
          {console.log(this.state.book)}
            <People 
                book = {this.state.book}
            />
        </div>
    )
  }
}
export default App