import React from 'react'
import Timec from '../css/Timec.css'

function Time() {

  let newDate = new Date()
  let date = newDate.getDate()
  let month = newDate.getMonth() + 1;
  let year = newDate.getFullYear();

  return (
    <span style={{ float: 'right', paddingRight: '5px' }}>
      {month}-{date}-{year}
    </span>
  )

}


export default Time

