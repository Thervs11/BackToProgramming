  // import { 
  //   BrowserRouter, 
  //   Routes, 
  //   Route
  // } from "react-router-dom";

  // import Home from "./pages/Home";
  // import Students from "./pages/Students";
  // import StudentDetails from "./pages/StudentDetails";

  // import Navbar from "./components/Navbar";

  // import { useState } from "react";

  // export default function App() {

  //   return (
  //     <BrowserRouter>
  //        <br />
  //        <br />
  //        <br />
  //        <br />
  //       <Navbar/>

  //       <Routes>
  //         <Route path="/" element={<Home />}/>
  //         <Route path="/students" element={<Students />}/>
  //         <Route path="/students/:id" element={<StudentDetails />}/>
  //       </Routes>
  //     </BrowserRouter>
  //   );
  // }

  
import { useState } from "react";

export default function App() {
  const [counter, setCounter] = useState(0);
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [information, setInformation] = useState([]);

  const handeSubmit = (e) => {
    e.preventDefault();

    const newInformation = {
      name,
      email
    };
    setInformation([...information, newInformation]);

    setName("");
    setEmail("");
  }

  return (
    <div>
      <h1>My App</h1>

      <p>Counter: {counter}</p>
      <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold p-2 rounded" onClick={() => setCounter(counter + 1)}></button>
      <br /><br />

      <input type="text" value={name} onChange={(e) => setName(e.target.value)} placeholder="Enter name"/>
  
      <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} placeholder="Enter email"/>

      <button onClick={handeSubmit}>Submit</button>

      {information.map((info, index) => (
        <div key={index}>
          <p>Name: {info.name}</p>
          <p>Email: {info.email}</p>
        </div>
      ))}


    </div>
  );
}