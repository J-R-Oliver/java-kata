# java-kata

<table>
<tr>
<td>
Repository for Java katas.
</td>
</tr>
</table>

## Contents

- [Getting Started](#getting-started)
- [Testing](#testing)
- [Conventional Commits](#conventional-commits)
- [GitHub Actions](#github-actions)

## Getting Started

### Prerequisites

To install and modify this project you will need to have:

- [Java](https://www.java.com)
- [Maven](http://maven.apache.org)
- [Git](https://git-scm.com)

### Installation

To start, please `fork` and `clone` the repository to your local machine.

## Testing

All tests have been written using [JUnit5](https://junit.org/junit5/). To run the test execute the _Maven_ `test` phase.

```bash
mvn clean test
```

Code coverage is measured by [Jacoco](https://www.jacoco.org/jacoco/trunk/index.html) and set to a minimum of 100%.

Mutation testing is provided by [Pitest](https://pitest.org). Mutation testing gauges the quality of testing by creating 
random mutation that should cause tests to fail. This ensures that your tests are working as expected. The mutation 
threshold is currently set to 80%.

The easiest way to generate reports is to execute the _Maven_ `verify` phase since _Jacoco_ and _Pitest_ goals have been 
bound to this phase.

```bash
mvn clean verify
```

Reports can be found in the `/target/` directory.

## Conventional Commits

This project uses the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) specification for commit
messages. The specification provides a simple rule set for creating commit messages, documenting features, fixes, and
breaking changes in commit messages.

A [pre-commit](https://pre-commit.com) [configuration file](.pre-commit-config.yaml) has been provided to automate
commit linting. Ensure that *pre-commit* has been [installed](https://www.conventionalcommits.org/en/v1.0.0/) and
execute...

```shell
pre-commit install
````

...to add a commit [Git hook](https://git-scm.com/book/en/v2/Customizing-Git-Git-Hooks) to your local machine.

An automated pipeline job has been [configured](.github/workflows/build.yaml) to lint commit messages on a push.

## GitHub Actions

A CI/CD pipeline has been created using [GitHub Actions](https://github.com/features/actions) to automated tasks such as
linting and testing.

### Build Workflow

The [build](./.github/workflows/build.yaml) workflow handles integration tasks. This workflow consists of two jobs, `Git`
and `Maven`, that run in parallel. This workflow is triggered on a push to a branch.

#### Git

This job automates tasks relating to repository linting and enforcing best practices.

#### Maven

This job automates `Maven` specific tasks.
