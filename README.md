# HelloActions-BraedenBurger

A simple Hello World project for Lab 11 that demonstrates a basic GitHub Actions workflow using Java.

SWE 525 - Lab 11

## What it does

`Hello.java` reads a name from the `WHO_TO_GREET` environment variable (defaulting to "World" if it isn't set), prints a greeting, and prints a message confirming it ran inside GitHub Actions.

## How it runs

The workflow in `.github/workflows/hello.yml` checks out the repository, sets up Java 17, compiles `Hello.java` with `javac`, and runs it with `java Hello`. It runs automatically on every push to `main` and can also be started manually from the Actions tab.

## Workflow Explanation

**1. What is the purpose of the `on` section?**
It defines the events that trigger the workflow. Here, the workflow runs on pushes to the `main` branch and when started manually.

**2. What does `workflow_dispatch` do?**
It adds a "Run workflow" button in the Actions tab so the workflow can be started manually without pushing new code.

**3. What does `runs-on` specify?**
It specifies the type of runner (virtual machine) the job runs on. This workflow uses `ubuntu-latest`, a GitHub-hosted Linux machine.

**4. Why is `actions/checkout` needed?**
The runner starts empty. `actions/checkout` downloads the repository's files onto the runner so later steps can access `Hello.java`.

**5. What does the language setup action do?**
`actions/setup-java` installs a Java Development Kit (Temurin, version 17) on the runner and adds it to the PATH so the `javac` and `java` commands are available.

**6. What is the difference between compiling and running the program?**
Compiling (`javac Hello.java`) translates the Java source code into bytecode stored in `Hello.class`. Running (`java Hello`) starts the Java Virtual Machine, which executes that bytecode and produces the output.

**7. Where can you see the program output?**
In the Actions tab: open a workflow run, click the job, and expand the "Run the Java program" step. The greeting appears in that step's log.

**8. What is the difference between a workflow, a job, and a step?**
A workflow is the entire automated process defined in a YAML file. A job is a group of steps that run together on one runner. A step is a single task inside a job, either running a shell command (`run`) or using a prebuilt action (`uses`).

## AI Usage

AI (Claude) was used as a guide to walk through the lab steps and help draft the code, workflow comments, and README explanations. I created the repository, committed the files, ran the workflow, and verified the output myself.

## Author

Braeden Burger
