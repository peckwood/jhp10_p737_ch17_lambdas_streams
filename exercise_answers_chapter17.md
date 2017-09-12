Chapter 17 my exercise answers

- 17.4

  - a. pipelines
  - b. external
  - c. immutability
  - d. Consumer
  - e.Producer
  - f. infinite
  - g. filter
  - h. collect
  - i. terminal
  - j. splitAsStream
  - k. abstract, default

  #### 17.5

  - a. f
  - b. T?
  - c. F
  - d. T
  - e. T
  - f. F compose is default, andThen is default
  - g. T

  #### 17.6

  - a. `(double a, double b) -> return a * b;`

  - b. `(a, b) ->return a * b;`

  - c. `(a, b) ->a * b`

  - d. `() -> 'Welcome to lambda'`

  - e. `ArrayList::new`

  - f. 

```java
button.addActionListener(event -> {
	JOptionPane.showMessageDialog(ParentFrame.this,
    "JButton event handler"); 
 })
```
#### 17.7

stream() create a stream based on the list. filter creates a stream including elements that are odd numbers from the previous stream. terminal operation sum sums up the total of odd numbers.

#### 17.8

1. method `ints`generates a 1000000 integers `IntStream` in the range of 1 to 3
2. `boxed` converts it to `Stream<Integer>`
3. `collect` creates a map where the key is each unique integer in the strem and the value is its frequency
4. `foreach` prints the key(side) and value(frequency) of each element in the map