import React from 'react';
import Card from "./components/Card/Card";
import aCar from "./data/data"
import CarCard from "./components/Car/CarCard"

const App = () => {
  const person = {
    name: "Sam",
    age: 23,
    interests: ["Golf", "Tennis", "Gym", "football"]
  }
  // pass down the person object
  // render the name and age on the page
  // map over the interests to make a bullet point for each one  

  return (
    <div>
      <Card person={person}/>
      <CarCard aCar={aCar}/>
    </div>

  )
}

export default App;

