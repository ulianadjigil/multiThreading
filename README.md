# multiThreading
## Task
<img src="https://user-images.githubusercontent.com/85234616/123069897-ed936f00-d41b-11eb-8c15-3aa38cac1528.jpg" width="500">
n = 3 <br/>
N = 1 000 000 000

## Solution
Structure:

<img width="201" alt="Снимок экрана 2021-06-23 в 13 56 28" src="https://user-images.githubusercontent.com/85234616/123085502-fd667f80-d42a-11eb-84c6-5ff7497c8b13.png">

Class **Counter** is responsible for calculating the arithmetic progression,implepents Runnable.  Method **threadCycle** counts the progression using "brute force" method. 

<img width="401" alt="Снимок экрана 2021-06-23 в 13 40 51" src="https://user-images.githubusercontent.com/85234616/123084967-67caf000-d42a-11eb-9a73-6d60893f6c75.png">


Class **FormulCounter** extends **Counter** and counts the progression using an arithmetic progression formula. 

<img width="370" alt="Снимок экрана 2021-06-23 в 13 41 32" src="https://user-images.githubusercontent.com/85234616/123263566-c9aa5900-d501-11eb-90fd-4b23a6133c7d.png">

In **Main** class one by one we calculate the progression by the formula, then in one thread, in two and so on. 

## Result

The accuracy is the same for all methods. The most efficient method is the method using an arithmetic progression formula.

<img width="406" alt="Снимок экрана 2021-06-22 в 20 22 40" src="https://user-images.githubusercontent.com/85234616/123070347-58dd4100-d41c-11eb-96de-d13ee3db2ef8.png">

