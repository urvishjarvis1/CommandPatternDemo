# Command Design Pattern
## Basics
Accoridng to wikipedia 
> In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method and values for the method parameters.

Basically there is `Invoker` which invokes the commands

in our case `OrderCommandProcessor`

```
class OrderCommandProcessor {
    private val listOfCommand= ArrayList<OrderCommand>()

    fun addToList(orderCommand: OrderCommand): OrderCommandProcessor = apply { listOfCommand.add(orderCommand) }
    fun processCommand(): String {
        var retu:String=""
        listOfCommand.forEach {
            val ret:String =it.execute()
            Log.d("TAG",ret)
            retu=retu+ret+"\n"
        }
        listOfCommand.clear()
        Log.d("TAG","retu:"+retu)
        return retu
    }
}
```
Then there is `Command` which encapsulate the object,

in our case `OrderCommand`

Further, the command will redirect the request to `Receiver` and it'll excute the task
