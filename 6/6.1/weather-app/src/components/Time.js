import React from 'react'

function Time() {

  let newDate = new Date()
  let date = newDate.getDate()
  let month = newDate.getMonth() + 1;
  let year = newDate.getFullYear();
  
  console.log(year) 
  return (
    <div>
      <p>{month}-{date}-{year}</p>
    </div>
  )

}


export default Time

