import logo from './logo.svg';
import './App.css';
import Appbar from "../src/components/Appbar.js";
import Student from "../src/components/Student.js";

function App() {
  return (
    <div className="App">
      <Appbar/>
        <Student/>
    </div>
  );
}

export default App;
