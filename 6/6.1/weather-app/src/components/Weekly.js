import WeeklyStyle from '../css/WeeklyStyle.css'
import storm from '../assets/storm.png'
import snow from '../assets/snow.png'
import rain from '../assets/rain.png'
import sunny from '../assets/sunny.png'

function Weekly() {
return (
  <div className="center">
    <table>
      <tr>
      <th></th>
        <th>Monday</th>
        <th>Tuesday</th>
        <th>Wednesday</th>
        <th>Thursday</th>
        <th>Friday</th>
        <th>Saturday</th>
        <th>Sunday</th>
      </tr>
      <tr>
        <th>Yakutsk, Sakha Republic, Russia</th>
        <td>High -1&#8451; | Low -13&#8451;<img src={storm}/></td>
        <td>High -1&#8451; | Low -13&#8451;<img src={storm}/></td>
        <td>High -18&#8451; | Low -28&#8451;<img src={snow}/></td>
        <td>High -15&#8451; | Low -31&#8451;<img src={snow}/></td>
        <td>High -12&#8451; | Low -30&#8451;<img src={rain}/></td>
        <td>High -8&#8451; | Low -16&#8451;<img src={rain}/></td>
        <td>High -3&#8451; | Low -17&#8451;<img src={storm}/></td>
      </tr>
      <tr>
        <th>Mecca, Saudi Arabia</th>
        <td>High 36&#8451; | Low 22&#8451;<img src={sunny}/></td>
        <td>High 36&#8451; | Low 22&#8451;<img src={sunny}/></td>
        <td>High 39&#8451; | Low 23&#8451;<img src={sunny}/></td>
        <td>High 40&#8451; | Low 22&#8451;<img src={sunny}/></td>
        <td>High 38&#8451; | Low 21&#8451;<img src={sunny}/></td>
        <td>High 36&#8451; | Low 20&#8451;<img src={sunny}/></td>
        <td>High 35&#8451; | Low 19&#8451;<img src={sunny}/></td>
      </tr>
      <tr>
        <th>Great Falls, MT</th>
        <td>High 46&#8457; | Low 29&#8457;<img src={sunny}/></td>
        <td>High 51&#8457; | Low 28&#8457;<img src={sunny}/></td>
        <td>High 41&#8457; | Low 28&#8457;<img src={rain}/></td>
        <td>High 48&#8457; | Low 31&#8457;<img src={sunny}/></td>
        <td>High 40&#8457; | Low 25&#8457;<img src={rain}/></td>
        <td>High 50&#8457; | Low 31&#8457;<img src={sunny}/></td>
        <td>High 58&#8457; | Low 42&#8457;<img src={sunny}/></td>
      </tr>
      <tr>
        <th>Tórshavn, Faroe Islands</th>
        <td>High 7&#8451; | Low 4&#8451;<img src={sunny}/></td>
        <td>High 6&#8451; | Low 3&#8451;<img src={rain}/></td>
        <td>High 9&#8451; | Low 3&#8451;<img src={rain}/></td>
        <td>High 7&#8451; | Low 5&#8451;<img src={sunny}/></td>
        <td>High 7&#8451; | Low 4&#8451;<img src={sunny}/></td>
        <td>High 6&#8451; | Low 4&#8451;<img src={sunny}/></td>
        <td>High 7&#8451; | Low 4&#8451;<img src={sunny}/></td>
      </tr>
      <tr>
        <th>San Pedro de Atacama, Chile</th>
        <td>High 24&#8451; | Low 8&#8451;<img src={sunny}/></td>
        <td>High 26&#8451; | Low 8&#8451;<img src={rain}/></td>
        <td>High 25&#8451; | Low 9&#8451;<img src={rain}/></td>
        <td>High 24&#8451; | Low 8&#8451;<img src={sunny}/></td>
        <td>High 26&#8451; | Low 7&#8451;<img src={sunny}/></td>
        <td>High 26&#8451; | Low 8&#8451;<img src={rain}/></td>
        <td>High 27&#8451; | Low 8&#8451;<img src={rain}/></td>
      </tr>
    </table>
 
  </div>
  
)
}

export default Weekly