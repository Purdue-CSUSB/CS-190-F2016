# Debugging with Eclipse

Debugging is a simple and great way to check where and what your code is doing at certain spot.

For example, if the result of your program isn't what you've expected, you can debug to see in which part of the code it has gone wrong.


### 1. Create breakpoints

There are a few ways to create breakpoints.

- by double-clicking the blank space on the left side of the line number
- by right-clicking the blank space and click 'toggle breakpoint'
- by pressing Ctrl + Shift + B while the line is selected

The breakpoints represents where the run will stop to let you check the status of variables.
Place as many breakpoints as you like. 

For example, to see if a method returns the value you want,
you might as well just place breakpoints on all the lines of the method.


### 2. Debugging

After creating all the breakpoints, you can start debugging.

Start debugging by
- right click then Debug As -> Java Application
- click bug icon next to Run at the top menu

This will shift you to Debug perspective. You can change perspective at top-right by switching between Java and Debug.

In Debug perspective, all the initiated variables will be shown at top right, while the middle will show you which line of codes is currently running. This will stop at the line you've created breakpoints at, and let you see the status of the variables.

At the top menu, Resume will run the program and stop at next breakpoint.
Step Into will strictly move to the next step of the program.

---

After seeing the codes run step-by-step, you can apply necessary changes to the code afterwards.

