Here's the information converted into a Markdown table:

| Function | Object reference | Return value | Is extension function |
|----------|------------------|--------------|-----------------------|
| let      | it               | Lambda result: Yes | -                      |
| run      | this             | Lambda result: Yes | -                      |
| run      | -                | Lambda result: No: called without the context object | -                      |
| with     | this             | Lambda result: No: takes the context object as an argument. | -                      |
| apply    | this             | Context object | Lambda result: Yes    |
| also     | it               | Context object | Lambda result: Yes    |

Here is a short guide for choosing scope functions depending on the intended purpose:
- Executing a lambda on non-nullable objects: ```let ```
- Introducing an expression as a variable in local scope: ```let```
- Object configuration: ```apply```
- Object configuration and computing the result: ```run```
- Running statements where an expression is required: non-extension ```run```
- Additional effects: ```also```
- Grouping function calls on an object: ```with```


*this*

run, with, and apply reference the context object as a lambda receiver - by keyword this. Hence, in their lambdas, the object is available as it would be in ordinary class functions.

https://kotlinlang.org/docs/scope-functions.html#functions



