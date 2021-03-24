import React from 'react';
import ReactHtmlParser, { } from 'react-html-parser';
import Footer from '../components/Footer.js';

class Slide extends React.Component {
  render() {
    const html = '<iframe src="https://docs.google.com/presentation/d/e/2PACX-1vTjXuWWmlg1Hx5Aa7jNZ5XCZI7qIbGzyMtRVDzqSmGMIwKP51N38teA37WmA-FIx1cXZ6WTRrBSAZqs/embed?start=false&loop=false" frameborder="0" width="960" height="660" allowfullscreen="true" mozallowfullscreen="true" webkitallowfullscreen="true"></iframe>';
    return <div>
      <div style={{ marginTop: '20px'}}>
        {ReactHtmlParser(html)}
      </div>
      
      <div className="foot">
        <Footer />
      </div>
    </div>;
  }
}
export default Slide