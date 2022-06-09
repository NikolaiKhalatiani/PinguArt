# PinguArt
Easy HW assignment from Java course at KIU

<p>It happens again and again that we humans need to quickly check whether two long numbers are the same. Since we struggle with this, we can try to generate a picture from the numbers. We can then check their equality much faster and in a more reliable way. For more information, interested readers can also look up the term <a rel="noopener noreferrer" href="https://superuser.com/questions/22535/what-is-randomart-produced-by-ssh-keygen">"Randomart"</a>, but this is not part of the task here.</p>
<p>Surprisingly, penguins are also faced with this problem, and now want to solve it in a similar way - with the implementation of "Pingu-Art".</p>  

 ## Program Statement
 <p>Your program should make it possible to visualize numbers entered by the user penguin as pingu art.</p>
 <p>In the first step, eight numbers should be entered via the console. If all numbers have been successfully read in and temporarily stored, they will be displayed as Pingu Art on the 
console.</p>
<p>Each of the <strong>eight</strong> numbers that the user penguin enters is a maximum of <strong>eight</strong> digits long and consists only of the digits <code>0</code>, <code>1</code>, <code>2</code> and <code>3</code>. The reason for the restriction to these digits is that penguins can only use three toes for counting (<a rel="noopener noreferrer" href="http://www.pinguine.net/pinguinlexikon/tauchen/äußerlicheanpassungen">more about penguins</a>). For numbers with fewer than eight digits, the "missing" front digits are implicitly <code>0</code> (e.g. the number <code>122</code> can also be seen as <code>00000122</code>). The program behavior is not defined for inputs that do not correspond to this format.</p>
<p>The prompt should look like this: </p>  

```
Please enter a Pingu Art number:
```
<p>After the user penguin has entered numbers eight times in this way, the Pingu-Art appears on the console. A Pingu-Art visualizes these numbers through a generated image that shows penguins swimming in the sea.</p>
<p>A Pingu-Art starts with the line</p>  

```
+---[PinguArt]---+
```
<p>Then the lines for the content of the picture follow:</p>  

```
|<Number 1><Number 2>|
|<Number 3><Number 4>|
|<Number 5><Number 6>|
|<Number 7><Number 8>|
```
<p><code>&lt;Number i&gt;</code> stands for the number <code>i</code> converted into Pingu-Art.
A number is converted as follows:</p>
<ul>
<li>The digits <code>0</code>, <code>1</code>, <code>2</code> and <code>3</code> are converted <code>" "</code> (space), <code>"-"</code>, <code>"~"</code> and <code>"P"</code> (penguin) respectively.</li>
<li>The number is processed from the last digit to the first digit.</li>
</ul>
<p>For example, the number <code>12010302</code> is converted to <code>"~ P - ~-"</code>, and the number <code>122</code> is converted to <code>"~~-     "</code>.</p>
<p>The Pingu-Art then ends with the line</p>  

```
+----------------+
```
<p>Then the program ends.</p>  

## Example
<p>An running example looks like:</p>  

```
Please enter a Pingu Art number:
> 20200220
Please enter a Pingu Art number:
> 10121201
Please enter a Pingu Art number:
> 12
Please enter a Pingu Art number:
> 10302101
Please enter a Pingu Art number:
> 2303120
Please enter a Pingu Art number:
> 1231200
Please enter a Pingu Art number:
> 20201210
Please enter a Pingu Art number:
> 120012
+---[PinguArt]---+
| ~~  ~ ~- ~-~- -|
|~-      - -~ P -|
| ~-P P~   ~-P~- |
| -~- ~ ~~-  ~-  |
+----------------+
```
<p>The lines that begin with <code>"&gt; "</code> mark the user input of the program. They are only given for the sake of clarity.</p>
<p><br></p>
<p>Another example with a test:<br>
The <code>"213201"</code>, <code>"0023201"</code>, <code>"032120"</code>, <code>"01010321"</code>, <code>"20320101"</code>, <code>"02120203"</code>, <code>"2103201"</code> und <code>"021320"</code> inputs are used for testing.</p>
<p><ins>Hint:</ins> In the lecture it was mentioned that number constants with leading zeros in the Java source text are regarded as octal numbers. When reading in with MiniJava via <code>readInt</code>, integers with leading zeros are still treated as decimal numbers, as is intended here.</p>




