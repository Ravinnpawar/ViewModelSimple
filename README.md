# ViewModelSimple

This is basic example of Viewmodel,
Viewmodelprovider
viewmodelfactory
ViewModels are simply model classes for views(activities and fragments) .
They provide methods for data transactions, so activates and fragments can just call to them and get the work done.
Activities and fragments destroy and recreate when configuration changes happen . So values they hold locally, can be lost.
 But ViewModels does not destroy in that way. Therefore they can hold the values belong to the activates and fragments.
A ViewModel’s onCleared() is called only when the app is put into the background, and the app process is killed, in order to free up the system’s memory.

What are the configurations changes in Android ?
Screen rotations.
Keyboard changes.
Language changes.
Enabling multi window mode.


The Android Jetpack View Model architecture component has introduced as a  solution for above problem.
As its name says, view model is a model for a view. It has designed to store and manage the UI-related data.
We usually create one View Model for an activity or a fragment. But, sometimes two or more  fragments can share one view model.
A ViewModel’s onCleared() is called only when the app is put into the background and the app process is killed in order to free up the system’s memory.
Therefore, lifecycle changes of activities and fragments does not affect to their ViewModels.

As we discussed earlier in this tutorial, we can not construct a ViewModel instance on our own.
Therefore, we need to use the ViewModelProvider utility provided by Android to create instances of ViewModels.
But, ViewModelProvider can only instantiate ViewModels with no arg constructors(like the one we studied above).
So, if the ViewModel has constructor parameters(arguments) , ViewModelProvider need a little extra support to create instances of it.
We provide that extra support by creating a Factory class and passing its instance to the ViewModelProvider.
The good news is ViewModel Factory has a common, boilerplate code. So, that means you can easily reuse(copy paste) the same code to all your projects by changing class names and parameters.
 When do we need the Application Context inside a  ViewModel ?
Initiating a database.
When using system services( to check internet availability,…)
 To use shared preferences.
In Android, having Application instance in a specific class is not a problem in general. But, if another Application instance references to that , then there can be a reference cycle error.
