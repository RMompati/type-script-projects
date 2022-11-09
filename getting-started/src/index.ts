/**
 * Fundermentals: TypeScript types.
  */

// If a variable is initialized the type can be inffered.

let scales: number = 123_456_789;
let course: string = "TypeScript Fundermentals.";
let is_published = true;

// The any type: Dangerous
let level;
level = 1;
level = "Level 1";

// Arrays

let numbers: number[] = [1, 2, 3];

// Tuples
let user: [number, string] = [1, "Patco"];

// Enums
const enum Size { Small, Medium, Large };
let shirtSize: Size = Size.Medium;
console.log(shirtSize);
 
// Functions
function calculateTax(income: number, taxYear = 2022): number {
  return (taxYear < 2022) ? income * 1.2 : income * 1.5;
}

console.log("R" + calculateTax(10700, 2015));
console.log("R" + calculateTax(10700));

// Objects
let employee: {
  readonly id: number,
  name: string,
  retire: (date: Date) => void
} = {
  id: 1, name: "Patco",
  retire: (date: Date) => {
    console.log(date);
    
  }
};