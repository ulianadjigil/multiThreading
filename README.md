# multiThreading
## Task
<img src="https://user-images.githubusercontent.com/85234616/123069897-ed936f00-d41b-11eb-8c15-3aa38cac1528.jpg" width="500">
n = 3 <br/>
N = 1 000 000 000

## Solution

In **main** method we call method **rarestWords** and pass file address to it. 

<img width="812" alt="Снимок экрана 2021-06-21 в 20 18 58" src="https://user-images.githubusercontent.com/85234616/122802480-1279cc00-d2ce-11eb-85f8-5bde82926227.png">

In **rarestWords** method we call method **findWords** which returns Map with words in our file and their amount(value). By the **Collections.min** method we find the number of the rarest words. Then in Map we find words with minimal value.

<img width="401" alt="Снимок экрана 2021-06-21 в 20 35 53" src="https://user-images.githubusercontent.com/85234616/122804371-84ebab80-d2d0-11eb-85d9-07ff618b07c1.png">

In **findWords** method we use **FileReader** and **BufferedReader** to read information from file. Using regular expressions we remove unnecessary characters and create Map with words and their amount.

<img width="496" alt="Снимок экрана 2021-06-21 в 21 10 28" src="https://user-images.githubusercontent.com/85234616/122808149-283ebf80-d2d5-11eb-8a5a-58fb425e24c7.png">

<img width="563" alt="Снимок экрана 2021-06-21 в 21 10 41" src="https://user-images.githubusercontent.com/85234616/122808169-2f65cd80-d2d5-11eb-8c2b-766eaae526ae.png">



## Result

<img width="406" alt="Снимок экрана 2021-06-22 в 20 22 40" src="https://user-images.githubusercontent.com/85234616/123070347-58dd4100-d41c-11eb-96de-d13ee3db2ef8.png">

