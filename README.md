# DependencyInjectionDemo

small dependency injection example in java for learning purposes

## What is dependency injection

In simple terms, dependency injection is a design pattern that make us achieve inversion of controle in our application by moving objects bindings from compile time to runtime.

## Further more explanation

In traditional Java applications, dependencies between classes are often established at compile time. This means that when you write your code and compile it, the relationships between various classes and their dependencies are fixed. For example, if you have a class A that depends on class B, you would typically create an instance of class B within class A and use it directly. This creates a tight coupling between the classes, and any changes in the dependencies or their implementations require you to modify and recompile the source code of class A.

Dependency Injection is a design pattern that promotes the decoupling of classes and their dependencies. It's a way to achieve Inversion of Control (IoC) by inverting the control of object creation and management. In the context of DI, "runtime" refers to the time when your program is actually running, as opposed to "compile time," which is when your code is being compiled.

So, when you say "moving object bindings from compile time to runtime," it means that the specific connections between classes and their dependencies are determined and established dynamically at runtime through the DI framework, rather than being hard-coded at compile time. This provides greater flexibility, maintainability, and testability in your application, as it allows you to change dependencies or configurations without altering the code of the classes that use them.
