import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [name, setName] = useState('');
  const [age, setAge] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8080/user/insert', { 
        userName : name, 
        userAge : age, 
      });
      console.log('User inserted:', response.data);
    } catch (error) {
      console.error('Error inserting user:', error);
    }
  };

  return (
    <div>
      <h1>Insert User</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <input
          type="number"
          placeholder="Age"
          value={age}
          onChange={(e) => setAge(e.target.value)}
        />
        <button type="submit">Insert</button>
      </form>
    </div>
  );
}

export default App;