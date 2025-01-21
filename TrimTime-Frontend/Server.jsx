import React, { useState } from 'react';
import axios from 'axios';

const Server = () => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);

  const fetchData = async () => {
    try {
      const response = await axios.get('http://localhost:8080/', {
        headers: {
          'Content-Type': 'application/json',
        },
        withCredentials: true, 
      });
      setData(response.data);
    } catch (err) {
      setError(err.message);
    }
  };

  return (
    <div>
      <h1>React Frontend</h1>
      <button onClick={fetchData}>Fetch Data</button>
      {data && (
        <div>
          <h2>Response Data:</h2>
          <pre>{JSON.stringify(data, null, 2)}</pre>
        </div>
      )}
      {error && <p style={{ color: 'red' }}>Error: {error}</p>}
    </div>
  );
};

export default Server;
