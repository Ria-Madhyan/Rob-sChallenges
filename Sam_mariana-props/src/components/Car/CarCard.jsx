import React from 'react'

const CarCard = (props) => {
  const {brand, color, prices, title, description, footer} = props.aCar

  const discount = prices.oldPrice - prices.newPrice;
  const discountPercent = (Math.round(discount/prices.oldPrice * 100 * 100))/100
  
  return (
    <div>
      <h1> The Car brand is {brand.toUpperCase()}</h1>
      <p> The Car color is {color}</p>
      <p> The Car prices  </p>
      <ul>
        <li>Old Price {prices.oldPrice}</li>
        <h3> Huge discount of {discount} which is {discountPercent} % </h3>
        <li>New Price {prices.newPrice}</li>
      </ul>      
      <p> Title: {title}</p>
      <p> Description: {description}</p>
      <p> Details of the car: {footer}</p>

    </div>
  )
}

export default CarCard

