```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //This line can cause issues
  }
  return a + b
}

println myMethod(5, null)
```