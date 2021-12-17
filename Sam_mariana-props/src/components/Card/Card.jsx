import React from 'react';

const Card = (props) => {
  const {name, age, interests}  = props.person ;

  return (
    <>
      <p>Name is {name}</p>
      <p>Age is {age} years</p>
      <ul>
        {/* the below line can be coded like this too {interests.map((interest) => <li>{interest}</li>)} */}
        {interests.map((interest)=> {
          return <li>{interest}</li>
        })}
      </ul>
    </>
  )
}

export default Card;