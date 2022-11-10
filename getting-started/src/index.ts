// Advanced Types

// Type Alias
type Employee = {
  id: number,
  firstName: string,
  lastName: string,
  retiresOn: (date: Date) => void
}

let patco: Employee = {
  id: 1,
  firstName: "Patco",
  lastName: "Erold",
  retiresOn: (date: Date) => { console.log("Retires on : " + date); }
}

// Union types

function kgToLbs(weight: number | string): number {
  // Narrowing.
  if (typeof weight === 'number') {
    return weight * 2.2;
  }
  
  return parseInt(weight) * 2.2;
}

// Intersection Types

type Draggable = {
  drag: () => void
};


type Resizable = {
  resize: () => void
};

type UIWidget = Draggable & Resizable;

let textBox: UIWidget = {
  drag: () => {},
  resize: () => {}
}

// Literal Types
type Quantity = 50 | 100;
type Metric = "cm" | "inch"

let quantity: Quantity = 50

// Nullable Types
function greet(name: string | null | undefined) {
  console.log( name ?  name.toUpperCase() : "Hola!" );
}

// Optional chaining.

type Customer = {birthday: Date};

function getCustomer(id: number): Customer | null | undefined {
  return id != 0 ? { birthday: new Date() } : null;
}

let customer = getCustomer(1);
console.log(customer?.birthday);
