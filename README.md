# Towers of Hanoi

This is a simple program that recursively computes a list of instructions for the optimal solution to the [Towers of Hanoi puzzle](https://en.wikipedia.org/wiki/Tower_of_Hanoi) for any given amount of disks `n`.
Said optimal solution will contain exactly <code>2<sup>n</sup> - 1</code> moves.

Program output:

```java
n = 5
0 -> 2
0 -> 1
2 -> 1
0 -> 2
1 -> 0
1 -> 2
0 -> 2
0 -> 1
2 -> 1
2 -> 0
1 -> 0
2 -> 1
0 -> 2
0 -> 1
2 -> 1
0 -> 2
1 -> 0
1 -> 2
0 -> 2
1 -> 0
2 -> 1
2 -> 0
1 -> 0
1 -> 2
0 -> 2
0 -> 1
2 -> 1
0 -> 2
1 -> 0
1 -> 2
0 -> 2
solved = true
```
