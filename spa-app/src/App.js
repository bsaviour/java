import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';

function Home() {
    const [counter, setCounter] = useState(0);
    
    return (
        <div>
            <h2>Home Page</h2>
            <p>Counter value: {counter}</p>
            <button onClick={() => setCounter(counter + 1)}>Increment Counter</button>
        </div>
    );
}

function About(props) {
    return (
        <div>
            <h2>About Page</h2>
            <p>{props.message}</p>
        </div>
    );
}

function App() {
    return (
        <Router>
            <div style={{ textAlign: 'center', padding: '50px' }}>
                <nav>
                    <Link to="/">Home</Link> | <Link to="/about">About</Link>
                </nav>
                <br />
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About message="This is a message passed using props!" />} />
                </Routes>
            </div>
        </Router>
    );
}

export default App;