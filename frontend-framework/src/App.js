import logo from './logo.svg';
import './App.css';

const name = "Jake"
name != "" :
const hasName = true;

const App = () => {
  return (
    <div className="App">
      <h1>Hello {hasName ? name : "human"}</h1>
    </div>
  );
}

export default App;
