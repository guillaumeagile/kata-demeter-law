# Law of Demeter

Try to write a test for the method 'calculateDamage' on the Player class, without changing any of the production code. Use the description below to help you design a test scenario. Note there are two example test cases to start from. Choose the one you prefer. Give yourself a time box of 10 min, then reflect on why this method is hard to test.

When you have reflected, you should refactor the 'calculateDamage' method to better follow the Law of Demeter. Also add test cases to cover the functionality in the Player class.

When you feel that you are done, depending on how much time you have, you may continue to implement tests until you have good coverage or look through the todo in the code (alt+6 in intellij). Reflect on which of these TODO hints will now be easier to address compared with before your refactoring work. And if code allowed it then try to implement those features. 

Example Data for use in Test cases
----------------------------------

Example equipment:

| Where     | What            | Base Damage | Damage Modifier |
|-----------|-----------------|-------------|-----------------|
| right hand|  flashy sword of danger | 10  | 1.0             |
| right hand|  excalibur              | 20  | 1.5             |
| left hand |  round shield           |  0  | 1.4             |
| feet      |  ten league boots       |  0  | 0.1             |
| head      |  helmet of swiftness    |  0  | 1.2             |
| chest     |  breastplate of steel   |  0  | 1.4             |

At present the only kind of enemy supported is a SimpleEnemy. This
kind of target has one Buff with a soakModifier of 1.0 and damage 
modifier of 1.0. It wears an Armor with a Damage Soak of 5.

