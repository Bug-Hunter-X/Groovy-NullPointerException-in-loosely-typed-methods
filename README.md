# Groovy NullPointerException Example

This repository demonstrates a common error in Groovy related to null pointer exceptions that can arise from the dynamic typing system.  The `bug.groovy` file showcases a method that can return null unexpectedly if input parameters are null.  `bugSolution.groovy` offers a more robust solution.

## How to reproduce

1. Clone this repository.
2. Run `groovy bug.groovy`.
3. Observe the unexpected behavior (or lack thereof, depending on how Groovy handles null in this case). Then run `groovy bugSolution.groovy` and notice the improved handling of nulls.

## Solution

The solution involves more explicit null checks to prevent potential exceptions.