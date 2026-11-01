import React, { useState } from 'react';

function App() {
    const [color, setColor] = useState('');

    return (
        <div style={{ textAlign: 'center', minHeight: '100vh', padding: '50px', backgroundColor: color }}>
            <h2>Color Selector App</h2>
            <button onClick={() => setColor('Red')}>Red</button>
            <button onClick={() => setColor('Blue')}>Blue</button>
            <button onClick={() => setColor('Green')}>Green</button>
            <button onClick={() => setColor('Yellow')}>Yellow</button>

            {color && <h2>You have selected {color}</h2>}
        </div>
    );
}

export default App;