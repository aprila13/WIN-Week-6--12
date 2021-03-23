import React, { useState } from "react";
function Footer() {
  const [textSwitch, setTextSwitch] = useState(true);
  return (
    <div className="btn">
      <button onClick={() => setTextSwitch(!textSwitch)} type="button">
        Click
      </button>
      <Greeting text={textSwitch} />
    </div>
  );
}
function Greeting(props) {
  console.log(props.text);
  if (props.text) {
    return (
      <p>
        Hello from: April, Echu, Eyke, Jonathan, and Laura!
      </p>
    );
  }
  return (
    <p>Nice to meet you!</p>
  );
}
export default Footer;